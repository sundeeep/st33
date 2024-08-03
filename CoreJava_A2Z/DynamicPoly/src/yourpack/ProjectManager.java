package yourpack;

import mypack.Employee;

public class ProjectManager extends Employee
{
	String projectName;
	int teamsize;

	public ProjectManager(int empId, String empName, int age, int salary, String projectName, int teamsize) {
		super(empId, empName, age, salary);
		this.projectName = projectName;
		this.teamsize = teamsize;
	}

	@Override
	public String toString() {
		return "ProjectManager [projectName=" + projectName + ", teamsize=" + teamsize + ", empId=" + empId
				+ ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}
	public void show(int age)
	{
		if(this.age<age)
			System.out.println("old enough");
		else
			System.out.println("Youth");
	}
	void display()
	{
		System.out.println("Welcome to the company");
	}

	public static void main(String[] args)
	{
		Employee pm=new ProjectManager(123,"Raj",23,70000,"BanK",25);

		pm.show(60000);
		//p1.display();
	}

}








