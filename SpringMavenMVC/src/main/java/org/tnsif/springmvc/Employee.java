package org.tnsif.springmvc;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int empid;
	private String empname;
	
	//getters and setters
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public void print() {
		System.out.println("Employee Belongs to IT Department");
		System.out.println("Empl id: "+ empid+ " Employee Name: "+ empname);
	}
	

}
