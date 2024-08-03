package mypack;

interface FirstInterface 
{
	int i=420;//public static final
	void show();//public abstract
	default void display()
	{
		System.out.println("Welcome to story");
	}
	default void test()
	{
		System.out.println("Test");
		//display();
	}
}
