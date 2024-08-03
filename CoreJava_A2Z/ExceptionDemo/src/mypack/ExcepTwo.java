package mypack;

public class ExcepTwo 
{

	public static void main(String[] args)
	{
		int i[]=new int[3];
		System.out.println("Welcome to main");
		try
		{
			i[3]=4/2;
			System.out.println(i[3]);
		}
		
		//catch(ArrayIndexOutOfBoundsException  e) {e.printStackTrace();}
		catch(ArithmeticException e) {e.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
	
		System.out.println("Back to main");

	}

}
