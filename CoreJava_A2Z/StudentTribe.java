class Employee
{
	int empId;
	String empName;
	int salary;
	String qual;
	Employee()
	{
		System.out.println("Employee");
	}
	Employee(int empId,String empName,int salary,String qual)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.qual=qual;
	}
	public String toString()
	{
		return empId+"  "+empName+" "+salary+"  "+qual;
	}
}
class Programmer extends Employee
{
	String project;
	String module;
	int yearsOfExp;
	Programmer()
	{
			System.out.println("Programmer()");
	}
	Programmer(int yearsOfExp,String project,String module)
	{
		this.project=project;
		this.module=module;
		this.yearsOfExp=yearsOfExp;		
	}
	Programmer(int empId,String empName,int salary,String qual,int yearsOfExp,String project,String module)
	{
		super(empId,empName,salary,qual);
		this.project=project;
		this.module=module;
		this.yearsOfExp=yearsOfExp;	
				
	}
	/*public String toString()
	{
		
		//return empId+" "+empName+"  "+salary+"  "+qual+
		return 	super.toString()+project+" "+module+"  "+yearsOfExp;
	}*/
}
class SeniorProgrammer extends Programmer
{
	int projects;
	String PM;
	SeniorProgrammer(int empId,String empName,int salary,String qual,int yearsOfExp,String project,String module,int projects,String PM)
	{
		super(empId,empName,salary,qual,yearsOfExp,project,module);
		this.projects=projects;
		this.PM=PM;
	
	}
	SeniorProgrammer(int projects,String PM)
	{
		System.out.println("SeniorProgrammer(int,String)");
		this.projects=projects;
		this.PM=PM;
	}
}
class StudentTribe
{
	public static void main(String[] ar)
	{
		Programmer p2=new Programmer(135,"Ram",100000,"MCA",5,"BlueCross","Deposit");
		System.out.println(p2);
	//	SeniorProgrammer p1=new SeniorProgrammer(1435,"Raj",90000,"MCA",5,"BlueCross","Deposit",3,"Ravi");
	//	System.out.println(p1);
	//	SeniorProgrammer sp=new SeniorProgrammer(3,"Lokesh");
	}
}











