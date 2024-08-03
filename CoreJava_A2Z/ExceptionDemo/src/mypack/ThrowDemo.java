package mypack;
import java.io.*;

public class ThrowDemo 
{
	void show(int i)  throws Exception
	{
		if(i==0)
			try
			{
			throw new Throwable("The Denominator is zero");
			}catch(Object e) {e.printStackTrace();}
		else
		{
			int j=34/i;
			System.out.println(j);
			System.out.println("Show Closing");
		}
	}
	void display() throws Throwable
	{
		show(0);
		System.out.println("display");
		throw new ArithmeticException("zero");
		
	}

	public static void main(String[] args)// throws IOException
	{
		ThrowDemo obj=new ThrowDemo();
		try
		{
			obj.display();
		}catch(Exception e) {e.printStackTrace();}
		System.out.println("Back to main");
	}

}
