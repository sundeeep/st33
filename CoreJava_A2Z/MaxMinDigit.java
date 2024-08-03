class MinMaxDigit
{
	public static void main(String[] ar)
	{
		int n=83816;
		int max=0,rem=0;
		while(n>0)//83916,8391,839
		{
			rem=n%10;//6,1,0
			n=n/10;//8391,839,83
			if(rem>max)
			{
			max=rem;//6,9
			}
		}
		System.out.println("the Maximum digit in given number is "+max);
	}
}











