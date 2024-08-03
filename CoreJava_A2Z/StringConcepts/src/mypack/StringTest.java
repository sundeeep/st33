package mypack;

public class StringTest 
{

	public static void main(StringOne[] args)
	{
		String s1="java";
		String s2="java";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());

		s2="Ram";
		System.out.println(s1.hashCode());

		System.out.println(s2.hashCode());

		System.out.println(s1);
		System.out.println(s2);
		}

}
