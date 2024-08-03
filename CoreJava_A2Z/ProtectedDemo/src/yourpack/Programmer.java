package yourpack;

import mypack.Employee;

public class Programmer extends Employee 
{
	int projectId;
	String projectName;
	protected Programmer(int empId, String empName, int age, int salary, int projectId, String projectName) {
		super(empId, empName, age, salary);
		this.projectId = projectId;
		this.projectName = projectName;
	}
	public Programmer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Programmer [projectId=" + projectId + ", projectName=" + projectName + ", empId=" + empId + ", empName="
				+ empName + ", age=" + age + ", salary=" + salary + "]";
	}
	public static void main(String[] args) 
	{
	//	Employee e2=new Employee();
	//	Employee e1=new Employee(12,"Ram",23,70000);
	//	System.out.println(e1);
		Programmer p1=new Programmer();
		p1.show();
		Programmer p2=new Programmer(125,"ravi",23,70000,345,"Bank");

	}

}
