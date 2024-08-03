class OuterClassOne
{
	int i=2134;
	OuterClassOne()
	{
		System.out.println("OuterClass()");
	}
	OuterClassOne(int i)
	{
		this.i=i;
	//	System.out.println("OuterClass(int i)");
	}
	void show()
	{
		//InnerClassOne obj1=new InnerClassOne();
		//obj1.display();
		InnerClassTwo obj2=new InnerClassTwo();
		obj2.test();
		System.out.println("Welcome to the Party");
	}
	void demo()
	{
		System.out.println(i);
	}
	class InnerClassOne
	{
		int i=12;
		InnerClassOne()
		{
			System.out.println("InnerClass()");
		}
		InnerClassOne(int i)
		{
			this.i=i;
			//System.out.println("InnerClass(int j)");
		}
		void display()
		{
			System.out.println(i);
			i=i+123;//12468
			System.out.println("Display");
			System.out.println(i);
		}
		static void method()
		{
			System.out.println("Method");
		}
		public static void main(String[] ar)
		{
			InnerClassOne obj=new InnerClassOne();
			System.out.println("InnerClassOne main");
		}
	}
	class InnerClassTwo
	{
		void test()
		{
			System.out.println("Test");
			InnerClassOne obj=new InnerClassOne();
			InnerClassOne.method();
			String[] ar={};
			InnerClassOne.main(ar);
		//	obj.display();
		}
	}
	public static void main(String[] ar)
	{
		OuterClassOne obj=new OuterClassOne(12345);
			obj.demo();
		obj.show();
	//	obj.InnerClass obj1=new obj.InnerClass();
		//System.out.println(obj.i);
		
		//OuterClassOne.InnerClassOne obj1=new OuterClassOne.InnerClassOne();
	//	obj.InnerClass(23).display();
	}
}