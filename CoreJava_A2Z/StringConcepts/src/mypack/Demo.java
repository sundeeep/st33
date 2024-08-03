package mypack;

public class Demo
{

	public static void main(String[] args)
	{
		String s1="Ram";
	s1=s1.intern();
		s1=s1.replace('m', 'j');
		String s2="Ram";
		System.out.println(s1);
		System.out.println(s2);
	}

}
