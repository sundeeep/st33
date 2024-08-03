package studenttribe;

public class Programmer extends Employee 
{
	int projectId;
	String projectName;
	public Programmer() 
	{
		super();
	}
	public Programmer(int empId, String empName, int salary, int age, int projectId, String projectName) {
		super(empId, empName, salary, age);
		this.projectId = projectId;
		this.projectName = projectName;
	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Programmer p1=new Programmer(2134,"Sai",70000,23,245,"Bank");
		Employee e1=(Employee)p1.clone();
		System.out.println(e1);

	}
	@Override
	public String toString() {
		return "Programmer [projectId=" + projectId + ", projectName=" + projectName + ", empId=" + empId + ", empName="
				+ empName + ", salary=" + salary + ", age=" + age + "]";
	}

}
