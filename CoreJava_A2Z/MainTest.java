class MainTest
{
	public static void main(int a)
	{
		System.out.println("main(int a)");
		System.out.println(a);
	}
	public static int main(int a,int b)
	{
		int c=a+b;
		System.out.println("main(int a,int b)");
		return c;
	}
	/*public static int  main(String[] ar)
	{
		System.out.println("Hai");
		return 89;
	}*/
	public static void main(String[] ar)
	{
		main(78);
		int c=main(12,34);
		System.out.println(c);
	}
}






