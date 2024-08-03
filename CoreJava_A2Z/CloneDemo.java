class CloneDemo
{
	int empId;
	String empName;
	int salary;
	public static void main(String[] ar)
	{
		CloneDemo e1=new CloneDemo(123,"Ravi",30000);
		
		CloneDemo e2=new CloneDemo(e1);
		CloneDemo e3= new CloneDemo(e2);
		/*e2.empId=e1.empId;
		e2.empName=e1.empName;
		e2.salary=e1.salary;*/
		System.out.println(e2);
		
		
	}
	CloneDemo(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	CloneDemo(CloneDemo cd)
	{
		this.empId=cd.empId;
		this.empName=cd.empName;
		this.salary=cd.salary;
		System.out.println("CloneDemo()");
	}
	
	public String toString()
	{
		return empId+"  "+empName+" "+salary;
	}
	
}








