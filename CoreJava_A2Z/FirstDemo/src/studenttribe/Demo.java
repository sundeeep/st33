package studenttribe;

public class Demo 
{
	int empId;
	String empName;
	int age;
	int salary;
	
	@Override
	public String toString() {
		return "Demo [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + ","
				+ "]";
	}

	public Demo(int empId) {
		super();
		this.empId = empId;
	}

	public Demo(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Demo(int empId, String empName, int age, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Demo obj=new Demo(123,"Sasi",23,45000);
		System.out.println(obj);

	}

}
