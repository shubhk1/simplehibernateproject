package com.hibernate.pojo;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity                            // this annotaton is equals to hbm.xml file 
@Table(name ="empTable")          // setting table name in database. here we use @Embeddable to join to table entity 
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)  // it automatic increase id value.
	private int sid;
	
	@Column(name="firstName")         // to set column name of table as firstName instead of sname .
	private String sname;
	
	@Transient                   // to exclude entity name such as coloumn name
	private String lastName;
	
	@Embedded                                     // this annotation is used to perform join operation 
	EmployeeAddress address;
			
	public EmployeeAddress getAddress() {
		return address;
	}
	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		
		this.sid = sid;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Employee [sid=" + sid + ", sname=" + sname + ", lastName="
				+ lastName + "]";
	}
	
	
	
	
	

}
