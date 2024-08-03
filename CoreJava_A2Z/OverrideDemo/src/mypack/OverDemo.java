package mypack;

public class OverDemo extends OverrideInherit
{
	void show(int i)
	{
		
		System.out.println("Stars");
		super.display(68);
	}
	public static void main(String[] args)
	{
		OverDemo obj=new OverDemo();
		obj.show(0);

	}

}
