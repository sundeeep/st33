package mypack;

public  class Employee
{
	public int empId;
	public String empName;
	public int age;
	public int salary;
	
	public  Employee() {
		super();
		System.out.println("SaiRam");
	}

	public  Employee(int empId, String empName, int age, int salary)
	{
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public  String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}
	
	public static void main(String[] args) {
		Employee e1=new Employee(234,"Raj",23,90000);
		System.out.println(e1);
		//Employee.show();

	}

}
