package mypack;

public interface FirstInterface 
{
	int i=12;
	void show();
	default void demo()
	{
		System.out.println("demo");
		
	}
	default void test()
	{
		System.out.println("test");
	}
}
