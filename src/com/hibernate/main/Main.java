package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojo.Employee;
import com.hibernate.pojo.EmployeeAddress;

public class Main {

	public static void main(String[] args) {

		Configuration con = new Configuration();   //creation of config class object.
		
		con.configure().addAnnotatedClass(Employee.class); 	// we dont need to put  hibernate.cfg.xml file into configure  becoz
															// it automatically load cfg file.

		SessionFactory sf = con.buildSessionFactory();   // it creates immutable objects.
		Session session = sf.openSession();           // create jdbc connection.

		Transaction trans = session.beginTransaction();   
		
		EmployeeAddress address = new EmployeeAddress();
		address.setCurAddress("Lucknow");
		address.setParAddress("Noida");
		
		Employee emp = new Employee();
		emp.setSname("shubham");
		emp.setAddress(address);
		//emp.setLastName("kushwah");
		//emp.setSid(1);

		session.save(emp);
		
		/*Employee emp = session.get(Employee.class, 3);
		System.out.println(emp);    // to fetch record from database.
*/		
		trans.commit();

	}

}
