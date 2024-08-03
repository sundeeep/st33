class StaticIntializer
{
	int i=90;
	
	StaticIntializer()
	{
		System.out.println("InstanceIntializer()");
	}
	StaticIntializer(int i)
	{
	//	this();
		System.out.println("InstanceIntializer(int i)");
		this.i=i;
	}
	static
	 {
		//int i=100;
		//i=i+2;
		System.out.println("Static Welcome");
	}
	
	public static void main(String[] ar)
	{
		StaticIntializer obj1=new StaticIntializer();
		StaticIntializer obj=new StaticIntializer(34);
		System.out.println(obj.i);
	}
}