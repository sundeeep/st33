class ThisDemo
{
	int a;
	ThisDemo(int a)
	{
		this.a=a;
	}
	void show()
	{
		int a=12;
		System.out.println(a);
		System.out.println(this.a);	
	}
	public static void main(String[] ar)
	{
		ThisDemo obj=new ThisDemo(34);
		obj.show();
	}
}