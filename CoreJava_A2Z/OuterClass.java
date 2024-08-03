class OuterClass
{
	int i=90;
	void show()
	{
		System.out.println("OuterClass Show");
		InnerClass obj=new InnerClass();
		obj.show();
	}
	class InnerClass
	{
		void show()
		{
			System.out.println("InnerClass show");
		}
	}
	public static void main(String[] a)
	{
		OuterClass obj=new OuterClass();
		obj.show();
		OuterClass.InnerClass obj1=obj.new InnerClass();
		obj1.show();
	}
}