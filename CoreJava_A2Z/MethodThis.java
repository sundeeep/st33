class MethodThis
{	int i=12;
	void show(int i )
	{
		this.display(i);
	}
	void display(int j)
	{
		j=24;
		System.out.println(j);
		this.demo();
	}
	void demo()
	{
		System.out.println("Demo");
	}
	public static void main(String[] ar)
	{
		MethodThis obj=new MethodThis();
		obj.show(8);
		System.out.println(obj.i);
	}
}