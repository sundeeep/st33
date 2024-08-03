package mypack;

import java.io.IOException;

public class Employee
{
	int empId;
	String empName;
	int age;
	int salary;
	int increment;

	public Employee() 
	{
		super();
	}
	

	public Employee(int empId, String empName, int age, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}
	public void hike() throws IOException
	
	{
		System.out.println("Hai");
		if(age>45)
		{
			increment=(salary*10)/100;
			salary=salary+increment;
			System.out.println(salary);
		}
		else
		{
			throw new IOException("Insuffient age");
		}
	}

	public static void main(String[] args) 
	{


	}

}
