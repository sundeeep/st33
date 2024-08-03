protected class OneDemo
{
	private int i=90;// default
	private  void show()
	{
	//	private int k=12;
		
		System.out.println(i);

	}
	void display()
	{
		System.out.println("Display()");
		show();
	}
	
	public static void main(String[] ar)
	{
		int j=55;
		OneDemo obj=new OneDemo();
		System.out.println(obj.i);
		obj.show();
		System.out.println(j);
	}
}
class TwoDemo
{
	public static void main(String[] ar)
	{
	//	String[] a={};
	//	OneDemo.main(a);
//cls
		OneDemo obj=new OneDemo();
		obj.display();
		//System.out.println(obj.i);
	//	obj.show();

	}
}





