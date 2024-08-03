class ExcepDemoOne
{
	public static void main(String[] ar)
	{
		int i=23;
		int j=12;
		System.out.println("Hi");
		try
		{
		j=i/0;
		}catch(Exception e){e.printStackTrace();}
		System.out.println("Enter");
		try
		{
			int k=j/0;
		}catch(Exception e){e.printStackTrace();}
		System.out.println("Bye");
		try{
			
		int m=345/2;
		int n=m/0;
		}catch(Exception e){e.printStackTrace();}
		System.out.println("Back to main");
		
	}
}