class FinalTest
{
	final int i;
	int j;
	FinalTest()
	{
		System.out.println("FinalTest");
		i=90;
	}
	FinalTest(int j)
	{
		System.out.println("FinalTest(int j)");
		this.j=j;
		i=100;
	}
	void show()
	{
		System.out.println(i);
	//	i=i*2;
		System.out.println(i*3);
		System.out.println(j);
	}
	public static final void main(String[] ar)
	{
		System.out.println("Welcome");
		FinalTest obj=new FinalTest();
		obj.show();
		FinalTest obj1=new FinalTest(23);
		obj1.show();
	}
}


