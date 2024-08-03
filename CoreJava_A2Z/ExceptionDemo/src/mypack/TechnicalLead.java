package mypack;

import java.io.*;
public class TechnicalLead extends Employee
{

	int yearsOfExp;
	String projectName;
	String moduleName;
	public TechnicalLead() {
		super();
	}
	public TechnicalLead(int empId, String empName, int age, int salary, int yearsOfExp, String projectName,
			String moduleName) {
		super(empId, empName, age, salary);
		this.yearsOfExp = yearsOfExp;
		this.projectName = projectName;
		this.moduleName = moduleName;
	}
	public void hike() throws IOException
	{
		System.out.println("SubClass Hike");
	
		if(salary<30000)
		{
			increment=(salary*20)/100;
			salary=increment+salary;
		}
		
		else
		
			throw new IOException("Salary is Greater than 30000");
		super.hike();
		//}catch(Exception e) {e.printStackTrace();}
		
	}
	public static void main(String[] args)
	{
		//Employee e1=new Employee(234,"Vicky",23,100000);
		//e1.hike();
		TechnicalLead tl=new TechnicalLead(123,"Ravi",23,50000,5,"BlueCross","Loan");
		try
		{
			tl.hike();
		
		}catch(Exception e) {e.printStackTrace();}
		System.out.println("Back to Main");

	}

}
