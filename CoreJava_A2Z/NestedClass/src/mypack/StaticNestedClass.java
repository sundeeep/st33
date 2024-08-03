package mypack;

public class StaticNestedClass 
{
		
	static class StaticInnerClass
	{
		void show()
		{
			System.out.println("Show");
		}
		static void demo()
		{
			System.out.println("Demo");
		}
	}
	void display()
	{
		System.out.println("Display");
		StaticInnerClass.demo();
		StaticInnerClass obj=new StaticInnerClass();
		obj.show();
	}
	public static void main(String[] args)
	{
		StaticInnerClass obj=new StaticInnerClass();
		obj.show();// TODO Auto-generated method stub
		StaticNestedClass obj1=new StaticNestedClass();
		StaticInnerClass.demo();
		StaticNestedClass.StaticInnerClass.demo();
		obj1.display();

	}

}
