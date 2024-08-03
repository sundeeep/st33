package mypack;

 interface FirstInter 
{
	 int i=90;
	void demo();
	void display();
	interface SecondInter
	{
		int i=100;
		void show();
		default void display()
		{
			System.out.println(i);
			System.out.println("SecondInter display");
		}
	}
	class NestedFirstInter
	{
		NestedFirstInter()
		{
			System.out.println("NestedFirstInter");
		}
		void test()
		{
			System.out.print("test");
		}
	}
}
