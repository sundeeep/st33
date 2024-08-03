package mypack;

public class Employee implements Cloneable
{
	int empId;
	String empName;
	int salary;
	
	public Employee(int empId, String empName, int salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	public static void main(String[] args)
	{
//		Employee e1=new Employee(23,"Puri",50000);
//		Employee e3=new Employee(23,"Puri",50000);
//		try {
//			Employee e2=(Employee)e1.clone();
//			System.out.println(e1.equals(e1));
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		String s1=new String("Siva");
		String s2=new String("Siva");
		System.out.println(s1.equals(s2));
}
	}


