package mypack;

public interface FirstInterface 
{
	void show();//abstract
	default void display()
	{
		System.out.println("display");
	}
	interface SecondInterface
	{
		void display();
		default void demo()
		{
			System.out.println("demo");
		}
	}
}
