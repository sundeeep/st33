package mypack;

import yourpack.*;
public class Employee 
{
	public int empId;
	public String empName;
	public int age;
	public int salary;
	public Address address;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int age, int salary, Address address)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", address=" + address + "]";
	}
	public static void main(String[] ar)
	{
		Address add1=new Address(234,"Sivaji","Chennai","India");
		Employee e1=new Employee(46,"Raj",23,90000,add1);
		System.out.println(e1);
				
	}
	
	public Employee(int empId, String empName, int age, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

}
