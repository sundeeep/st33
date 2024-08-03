package mypack;

import mypack.*;//.SecondInterface;

public class NestedInterfaceDemo implements FirstInterface, FirstInterface.SecondInterface 
{
	@Override
	public void show() {
		// TODO Auto-generated method stub

	}
	public void display()
	{
		System.out.println("display");
	}
	public void demo()
	{
		System.out.println("demo");
	}
	public static void main(String[] args)
	{
		FirstInterface.SecondInterface obj=new NestedInterfaceDemo();
		NestedInterfaceDemo obj1=new NestedInterfaceDemo();
		obj.demo();
		obj.display();
	}

}
