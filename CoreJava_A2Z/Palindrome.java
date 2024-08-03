class Palindrome
{
	public static void main(String[] ar)
	{
		int  i=414,rem=0,n=0;
		int temp=i;
		while(i>0)//41>0,4>0
		{
			rem=i%10;//4,1,4
			i=i/10;//41,4,0
			n=n*10+rem;//4,41,414
		}
		if(temp==n)
		System.out.println("Given number is Palindrome");
		else
		System.out.println("Given number is not Palindrome");
	}
}



