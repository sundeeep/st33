interface Greetings
{
	void sayHello();
}
class Greeter// implements Greetings
{
	
	void greet()
	{
		Greetings obj=new Greetings()
			{public void sayHello(){System.out.println("Hello World");}};
		obj.sayHello();
	}
	public static void main(String[] ar)
	{
		Greeter obj=new Greeter();
		obj.greet();
	}
}