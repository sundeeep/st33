class WhileDemo
{
	void show(int a,int b)
	{
		int c=a+b;
		while(c<25)
		{
			if(c>=18)
			{
				System.out.println("Welcome to Vote");
			}
			else if (c==16)
			{
				System.out.println("Go to Play");
				c++;
				break;
			}
			System.out.println("Go Back");
		}
	}
	public static void main(String[] ar)
	{
		WhileDemo obj=new WhileDemo();
		obj.show(8,8);
	}
	
}