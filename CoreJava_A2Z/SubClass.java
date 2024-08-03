class SuperClass
{
	int i=90;
	static void show()
	{
		System.out.println("super show");
	}
	
	public static void main(String[] ar)
	{
		System.out.println("SuperClass");
	}
}
class SubClass extends SuperClass
{
	//@Override
	static void show()
	{
		System.out.println("Sub show");
	}
	public static void main(String[] ar)
	{
		SuperClass s1=new SuperClass();
		System.out.println(s1.i);//90
		SubClass s2=new SubClass();
		System.out.println(s2.i);
	}
}



