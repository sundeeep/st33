package tribe;
import studenttribe.*;
class PackTest
{
	void display()
	{
		System.out.println("Display");
	}
	public static void main(String[] ar)
	{
		PackSub obj1=new PackSub();
		PackTest obj=new PackTest();
		obj.display();
		obj1.demo();
		//obj1.show();
		
	}
}