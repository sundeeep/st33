public class UnaryOperator
{
	public static void main(String[] a)
	{
		int i=9;
		if((i++>9)||(++i<9))
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(++i);
		}
		
	}
}