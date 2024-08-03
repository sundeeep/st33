package mypack;

public class LocalOuterClass 
{

	int i=34;
	
	public LocalOuterClass(int i) 
	{
		super();
		this.i = i;
	}

	public LocalOuterClass() 
	{
		super();
		System.out.println("locaOuterClass");
	}
	void show()
	{
		System.out.println("OuterClass Show");
	}
	void display()
	{
		int k=90;
		System.out.println("OuterClass display");
		class LocalInnerClass
		{
			int j=23;

			public LocalInnerClass() 
			{
				super();
				System.out.println("LocalInnerClass");
			}

			public LocalInnerClass(int j)
			{
				super();
				this.j = j;
			}
			void test()
			{
				System.out.println("LocalInnerClass test");
				System.out.println(k);
			//	k=i+23;
				System.out.println(k+23);
			}
			void demo()
			{
				System.out.println("demo");
				LocalInnerClass obj=new LocalInnerClass();
				obj.test();
			}
			static void method()
			{
				System.out.println("method");
			}
			public static void main(String[] ar)
			{
				System.out.println("LocalInner Class Main");
			}
		}
		
		LocalInnerClass obj=new LocalInnerClass();
		obj.test();
		LocalInnerClass.method();
		String str[]= {};
		LocalInnerClass.main(str);
		System.out.println(obj.j);
	}
	public static void main(String[] args) 
	{
		LocalOuterClass obj=new LocalOuterClass();
		obj.display();
	}

}
