package mypack;

import mypack.FirstInterface.SecondInterface;

public class NestedDemo implements SecondInterface {

	@Override
	public void display()
	{
		System.out.println("Display");

	}
	public static void main(String[] ar)
	{
		FirstInterface.SecondInterface obj=new NestedDemo();
		obj.display();
	}

}
