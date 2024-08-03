class ThisTest
{
	int n1;
	int n2,n3;
	ThisTest()
	{
		System.out.println("ThisTest()");
	}
	ThisTest(int n1)
	{
		System.out.println("ThisTest(int n1)");
		this.n1=n1;
		 n2=789;
	}
	ThisTest(int n1,int n2)
	{
		System.out.println("ThisTest(int n1,int n2)");
		this.n1=n1;
		this.n2=n2;
	}
	ThisTest(int n1,int n2,int n3)
	{
	//	this(n1,n2);
	this.n1=908;
	this.n2=456;
	System.out.println("ThisTest(int n1,int n2,int n3)");
		this.n3=n3;
	//	n2=123;
			
	}
	public String toString()
	{
		return n1+"  "+n2+"  "+n3;
	}
	public static void main(String[] ar)
	{
		ThisTest t1=new ThisTest(90,100,30);
		System.out.println(t1);
		ThisTest t2=new ThisTest(12);
		System.out.println(t2.n2);
	}
}




