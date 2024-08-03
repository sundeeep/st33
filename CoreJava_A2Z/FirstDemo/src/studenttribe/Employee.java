package studenttribe;

public class Employee implements Cloneable
{	
	int empId;
	String empName;
	int salary;
	int age;
	public Employee() {
		super();
	}
	public Employee(int empId, String empName, int salary, int age) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.age = age;
	}
	void show()
	{
		System.out.println("Siva the great");
	}
	public static void main(String[] ar) throws CloneNotSupportedException
	{
		Employee e1=new Employee(123,"Siva",50000,23);
		Employee o1=(Employee)e1.clone();
		System.out.println(o1);
		e1.show();
		o1.show();
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", age=" + age + "]";
	}
}
