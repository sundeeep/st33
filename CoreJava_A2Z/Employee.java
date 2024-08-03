class Employee
{
	int empId;
	String empName;
	int age;
	int salary;
	Employee()
	{
		System.out.println("Employee");
	}
	Employee(int empId,String empName,int age,int salary)
	{
		System.out.println("Employee(4 arguments)");
		this.empId=empId;
		this.empName=empName;
		this.age=age;
		this.salary=salary;
		
	}
	void show()
	{
		System.out.println(empId+"  "+empName+"  "+age+"   "+salary);
	}
	Employee checkAge(Employee e2)
	{
		if(this.age>e2.age)
			return e2;
		else
			return this;
		
	}
	
	public static void main(String[] ar)
	{
		Employee emp1=new Employee(123,"Ravi",23,90000);
		Employee emp2=new Employee(345,"Raj",21,100000);
		//emp1.show();
		//emp2.show();
		//Employee emp=Employee.chechAge(emp1,emp2);
		Employee emp=emp1.checkAge(emp2);
		emp.show();
	}
	
}












