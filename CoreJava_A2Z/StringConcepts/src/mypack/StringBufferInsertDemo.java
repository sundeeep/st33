package mypack;

public class StringBufferInsertDemo
{
	public static void main(String[] ar)
	{
		StringBuffer obj=new StringBuffer("WelcomeIndia");
		System.out.println(obj.insert(7, " to "));
		obj.trimToSize();
		System.out.println(obj);
		
	}

}
