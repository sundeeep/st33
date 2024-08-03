package mypack;
public interface FirstInterface
{
	 void show();
	default void display()
	{
		System.out.println("Display");
	}
	static  void demo()
	{
		System.out.println("demo");
	}
}
