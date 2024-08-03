class A
{
	void show()
	{
		System.out.println("A");
		
	}
}
class B extends A
{
}
class C extends B
{
	void show()
	{
		super.show();
		System.out.println("subShow");
	}
	public static void main(String[] ar)
	{
		C obj=new C();
		obj.show();
	}
}
	