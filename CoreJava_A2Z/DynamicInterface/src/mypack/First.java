package mypack;

public interface First 
{
	void show();
	default void display()
	{
		System.out.println("First Display");
		test();
	}
	default void display(int k)
	{
		
	}
	private void method()
	{
		System.out.println("First Method");
		
	}
	private static void test()
	{
		System.out.println("Static First Test");
	}
}
