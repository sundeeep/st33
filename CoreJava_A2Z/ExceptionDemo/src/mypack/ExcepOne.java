package mypack;

public class ExcepOne
{
	void show(int i)
	{
			System.out.println("Welcome to Show");
			
			int j=23/i;
			System.out.println(j);
			
			System.out.println("Back to show");
	}
	void display()
	{
		System.out.println("display");
		try
		{
			show(0);
		}catch(Exception e) {e.printStackTrace();}
		System.out.println("Back to display");
	}
	public static void main(String[] args) 
	{
		ExcepOne obj=new ExcepOne();;;;;;;;;;;
		System.out.println("hi");
	//	try
	//	{
			obj.display();
	//
		System.out.println("Bye");

	}

}
