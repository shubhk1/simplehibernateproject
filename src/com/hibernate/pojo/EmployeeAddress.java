package com.hibernate.pojo;

import javax.persistence.Entity;

@Entity
public class EmployeeAddress {
	
	private String parAddress,curAddress;

	public String getParAddress() {
		return parAddress;
	}

	public void setParAddress(String parAddress) {
		this.parAddress = parAddress;
	}

	public String getCurAddress() {
		return curAddress;
	}

	public void setCurAddress(String curAddress) {
		this.curAddress = curAddress;
	}

	@Override
	public String toString() {
		return "EmployeeAddress [parAddress=" + parAddress + ", curAddress="
				+ curAddress + "]";
	}
	
	
	

}
