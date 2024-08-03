class StaticFinalDemo
{
	final int i;
	int id;
	StaticFinalDemo()
	{
		i=90;
	}
	StaticFinalDemo(int id)
	{
		this.id=id;
		i=81;
	}
	public static void main(String[] ar)
	{
		StaticFinalDemo obj1=new StaticFinalDemo();
		StaticFinalDemo obj2=new StaticFinalDemo(124);
	}
	
}
/*class DemoStatic
{
	int i=12;
	void show()
	{
		System.out.println(StaticFinalDemo.i);//90
		int i=StaticFinalDemo.i*2;//180
		System.out.println(StaticFinalDemo.i);//90
		System.out.println(i);//180
	}
	public static void main(String[] ar)
	{
		DemoStatic obj=new DemoStatic();
		obj.show();
		System.out.println(obj.i);//12,
	}
}*/