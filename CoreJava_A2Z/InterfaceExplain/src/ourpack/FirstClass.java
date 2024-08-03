package ourpack;

import mypack.FirstInterface;
import yourpack.SecondInterface;

public class FirstClass implements  SecondInterface {

	@Override
	public void show() {
		System.out.println("show");
	}
	public void demo()
	{
		int i=34;
		System.out.println("SuperDemo");
		SecondInterface.super.demo();
		SecondInterface.super.test();
		SecondInterface.super.second();
		i=FirstInterface.i+SecondInterface.i;
		System.out.println(i);
	}
	public static void main(String[] args) {
	
		FirstInterface obj=new FirstClass();
		SecondInterface obj1=new FirstClass();
		obj.show();
		obj1.show();
		obj.demo();
		obj1.demo();
		obj1.second();
		
		
	//	FirstInterface.super.demo();

	}

}
