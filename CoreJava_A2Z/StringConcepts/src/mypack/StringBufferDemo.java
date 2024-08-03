package mypack;

public class StringBufferDemo 
{

	public static void main(String[] args)
	{
		String s="madam";
		StringBuffer obj1=new StringBuffer(s);
		StringBuffer obj2=new StringBuffer();
		 obj2=obj1.reverse();//enomadam
		String s1=new String(obj1);
		if(s.equals(s1))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	/*	StringBuffer obj1=new StringBuffer("Sai");
		StringBuffer obj2=new StringBuffer();
		String s1=new String(obj1);
		System.out.println(s1);
		StringBuffer obj3=new StringBuffer(s1);
	//	System.out.println(obj1==obj2);
		int i=90;
		obj2=obj1.append(i);
		System.out.println(obj2);
		System.out.println(obj1);
	//	System.out.*/
	}

}
