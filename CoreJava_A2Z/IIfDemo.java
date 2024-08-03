import java.util.*;
class IfDemo
{
	static int a=90;
	void show(int a)
	{
		if(a<10)
		{
			System.out.println("Small Kid");
		}
		else if((a>10)&&(a<25))
		{
			System.out.println("Kid");
		}
		else if((a==10)||(a==25))
		System.out.println("Student");
		else
			System.out.println("Citizen");
	}
	public static void main(String[]  ar)
	{
		IfDemo obj=new IfDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int a=sc.nextInt();
		obj.show(obj.a);

	}
}




