class ReturnTest
{
	int valueShow()
	{
		System.out.println("valueShow()");
		return 90;
	}
	public static void main(String[] ar)
	{
		ReturnTest obj=new ReturnTest();
		int j=obj.valueShow();
		System.out.println(j);
	}
}






