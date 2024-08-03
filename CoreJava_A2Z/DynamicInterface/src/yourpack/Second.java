package yourpack;

public interface Second 
{
	void show();
	default void display()
	{
		System.out.println("Second Display");
	}
	default void demo()
	{
		System.out.println("Second demo");
	}
	static void test()
	{
		System.out.println("Static second Test");
	}
}
