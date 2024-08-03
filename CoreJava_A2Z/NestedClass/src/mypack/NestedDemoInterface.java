package mypack;

import mypack.FirstInter;
import mypack.FirstInter.SecondInter;

public class NestedDemoInterface extends FirstInter.NestedFirstInter implements FirstInter,FirstInter.SecondInter
{

	public void demo()
	{
		System.out.println("FirstInter Demo");
	}
	public void display()
	{
		System.out.println("FirstInter display");
	}
	public void show()
	{
		
	}

	public static void main(String[] args)
	{
		SecondInter obj=new NestedDemoInterface();
		FirstInter obj1=new NestedDemoInterface();
		NestedFirstInter obj2=new NestedDemoInterface();
		obj1.display();
		obj.show();
		obj.display();
		obj2.test();

	}

}
