package com.st;


public class Employee
{
		int empId;
		String empName;
		
		public int getEmpId()
		{
			return empId;
		}
		public void setEmpId(int empId) 
		{
			this.empId = empId;
		}
		public String getEmpName()
		{
			return empName;
		}
		public void setEmpName(String empName) 
		{
			this.empName = empName;
		}
		public void displayInfo()
		{
			System.out.println(empId+" "+empName);
		}
	}
