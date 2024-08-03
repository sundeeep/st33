package yourpack;
import mypack.*;
class FirstInterOne implements FirstInterface
{
	public void show()
	{
		System.out.println("show");
	}
	public void display()
	{
		System.out.println("display");
		
	}
	public static void main(String[] ar)
	{
		FirstInterOne obj=new FirstInterOne();
		obj.show();
		obj.display();
		FirstInterface.demo();
	}
}