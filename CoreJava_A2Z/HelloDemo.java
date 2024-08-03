abstract class HaiProgram
{
	abstract void show();
	//abstract void display(int x,int y);
	
}
class HelloDemo
{
	public static void main(String[] ar)
	{
		HaiProgram obj=()->System.out.println("Welcome");
		obj.show();
	}
}