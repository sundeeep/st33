class SuperTest
{
	int  show()
	{	
		return 90;
	}
	void getMsg()
	{
			System.out.println("Welcome to SuperTest");
	}
}
class SubTest extends SuperTest
{
	void  show()
	{
		System.out.println("SubShow");
		//return this;
	}
	void getMsg()
	{
			System.out.println("Welcome to SubTest");
	}
	public static void main(String[] ar)
	{
		SubTest obj=new SubTest();
		obj.show();;//.getMsg();;
	}
}