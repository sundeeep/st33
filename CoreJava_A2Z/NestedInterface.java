

interface First
{
	void display();
	public interface Second
	{
		void show();
		default void test()
		{
			System.out.println("Interface Test");
		}
	}
	class Third
	{
		void method()
		{
			System.out.println("Method");
		}
		static void rain()
		{
			System.out.println("rain");
		}
	}
	
}
class NestedInterface extends First.Third implements First.Second
{
	public void display()
	{
		System.out.println("Display");
	}
	public void show()
	{
		System.out.println("Show");
	}
	public static void main(String[] ar)
	{
		First.Second obj=new NestedInterface();
		//obj.display();
		First.Third obj1=new NestedInterface();
		obj1.method();
		obj.show();
		obj.test();
	}
}