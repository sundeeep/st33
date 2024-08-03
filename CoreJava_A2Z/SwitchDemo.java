import java.util.*;
class SwitchDemo
{
	void show(String a)
	{
		System.out.println(a);
		switch(a)
		{
			case "1": System.out.println("Monday");
					break;
			case "2": System.out.println("Tuesday");
					//break;
			case "3": System.out.println("Wednesday");
					break;
			case "4":System.out.println("Thursday");
					break;
			case "5": System.out.println("Friday");
					break;
			case "6" :System.out.println("Saturday");
					break;
			default: System.out.println("Sunday");
		}
	}
	
	public static void main(String[] ar)
	{
		SwitchDemo obj=new SwitchDemo();
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		obj.show(str);
	}	
}