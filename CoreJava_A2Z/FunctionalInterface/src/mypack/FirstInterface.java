package mypack;

@FunctionalInterface

public interface FirstInterface
{
	void show();
	//void test();
	default void display()
	{
		System.out.println("display");
	}

}
