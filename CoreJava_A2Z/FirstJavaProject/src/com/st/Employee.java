
package com.st;

public class Employee {

	private String empName;
	private int empId;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void displayName()
	{
		System.out.println("Hello" +empName);
	}

}
