package com.st;

public interface FirstInterface
{
	void show();
	default void display()
	{
		System.out.println("Display");
		test();
		demo();
	}
	private void test()
	{
		System.out.println("Test");
		
	}
	private static void demo()
	{
		System.out.println("demo");
	}
}
