package studenttribe;

import mypack.First;
import ourpack.FirstClass;
import yourpack.Second;

public class SecondClass extends FirstClass implements Second, First
{
	public void display()
	{
		super.display();
		First.super.display();
	//	Second.super.display();
	//	Second.super.demo();
	//	First.test();
	//	Second.test();

		System.out.println("SecondClass display");
	}
	public static void main(String[] args) 
	{
		FirstClass obj=new SecondClass();
		obj.show();
		obj.display();
	//	obj.method();

	}

}
