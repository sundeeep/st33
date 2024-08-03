class SandeepException extends Exception
{
	SandeepException(String s)
	{
		System.out.println(s);
	}
	void show(int age) throws Exception
	{
		if(age<24)
			throw new SandeepException("Welcome");
		else
			System.out.println("Bye");
	}
	public static void main(String[] ar)
	{
		SandeepException obj=new SandeepException("Not Flexible");
		try
		{	
			obj.show(22);
		}catch(Exception e){e.printStackTrace();}
		System.out.println("Back to main");
		finally
		{}
	}
}