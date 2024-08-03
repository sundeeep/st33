package mypack;

import yourpack.InterfaceFirst;

public class Sandeep {

		void demo()
		{
			InterfaceFirst  obj=new InterfaceFirst() {public void display() {System.out.println("display");}
									void test() {System.out.println("test");}};
			obj.display();
			obj.test();
			obj.show();
		}
	public static void main(String[] args)
	{
		new Sandeep().demo();

	}

}
