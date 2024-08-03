package mypack;

public class Employee
{
	public int empId;
	public String empName;
	public int age;
	public int salary;
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
	public void show(int salary)
	{
		if(this.salary<salary)
			System.out.println("midlevel");
		else
			System.out.println("Top Mgt");
	}
}








