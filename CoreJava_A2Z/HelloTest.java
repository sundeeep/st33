interface Hai
{
	private void show()
	{
		System.out.println("SuperStar");
	}
	default void display()
	{
		show();
	}
}
class HelloTest implements Hai
{
	void show()
	{
		//super.show();
			System.out.println("Mega Star");
	}
	public static void main(String[] ar)
	{
		Hai obj=new HelloTest();
		obj.display();
	}
}