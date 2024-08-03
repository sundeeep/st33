class InstanceIntializer
{
	int i=90;
	
	InstanceIntializer()
	{
		System.out.println("InstanceIntializer()");
	}
	InstanceIntializer(int i)
	{
		this();
		System.out.println("InstanceIntializer(int i)");
		this.i=i;
	}
	{
		int i=100;
		i=i+2;
		System.out.println(i);
	}
	{
		System.out.println("SaiRam");
	}
	public static void main(String[] ar)
	{
		InstanceIntializer obj1=new InstanceIntializer();
		InstanceIntializer obj=new InstanceIntializer(34);
		System.out.println(obj.i);
	}
}