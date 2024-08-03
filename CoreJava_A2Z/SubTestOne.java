
import java.io.*;
class SuperTestOne
{
	void show()
	{
		System.out.println("SuperTest show");
	}
	
}
class SubTestOne extends SuperTestOne
{
	void show() throws ArrayIndexOutOfBoundsException
	{
		super.show();
		System.out.println("SubTest  show");
		throw new ArrayIndexOutOfBoundsException("ExceptionDemo.java");
		
	}
	public static void main(String[] ar)
	{
		SubTestOne obj=new SubTestOne();
		try
		{
			obj.show();
		}catch(Exception e){e.printStackTrace();}
		System.out.println("Back to Main");
	}
}