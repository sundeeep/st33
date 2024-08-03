class ExceptionDemo
{
	void show()
	{
		System.out.println("Java");
	}
	public static void main(String[] a)
	{
		int i=90;
		System.out.println(i);
		try
		{
			int k=234/2;
			System.out.println(k);
			int j=i/2;
			System.out.println(j);
			int m=234/0;
			System.out.println(m);
		}
		catch(Exception  e)
		{
			e.printStackTrace();
			ExceptionDemo obj=new ExceptionDemo();
			obj.show();
			System.out.println("Hai");
			int k=21/7;
			System.out.println(k);
			
				int m=2344/0;
				System.out.println("We are sleepy");
			//}catch(Exception e1){e1.printStackTrace();}
		}
		finally
		{
			System.out.println("Finally block");
		}
		System.out.println("Back to Main");
		
	
	}
}