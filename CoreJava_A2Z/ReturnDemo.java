class ReturnDemo
{
	int show()
	{
		System.out.println("Show");
		return 923;
	}
	public static void main(String[] ar)
	{
		ReturnDemo obj=new ReturnDemo();
		System.out.println(obj.show());
		System.out.println("Back to Main");
	}
}






