class A
{
	A show()
	{
		System.out.println("A");
		return this;
	}
	
}
class B extends A
{
	B  show()
	{
		//super.show();
		System.out.println("B");
		return this;
	}
	void display()
	{
			System.out.println("Sandeep");
	}
	public static void main(String[] a)
	{
		A obj=new B();
		obj.show();
		
	}
}