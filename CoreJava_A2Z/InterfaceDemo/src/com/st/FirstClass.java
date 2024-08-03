package com.st;

public class FirstClass implements FirstInterface {

	@Override
	public void show()
	{
		System.out.println("Show");

	}
/*	public void display()
	{
		System.out.println("Class Display");
	}*/

	public static void main(String[] args) {
		FirstInterface obj=new FirstClass();
		obj.show();
		obj.display();
	//	FirstInterface.demo();
		

	}

}
