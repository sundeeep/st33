class ReferenceVariable
{
	static int i=90;
	void main()
	{
		int j=12;;
		System.out.println(j);
		System.out.println(i);//90
		i=i*2;
		System.out.println(i);//180
	}
	public static void main(String[] ar)
	{
		ReferenceVariable obj=new ReferenceVariable();
		System.out.println(obj.i);//90
		obj.main();
		System.out.println(obj.i);//
		ReferenceVariable obj1=new ReferenceVariable();
		System.out.println(obj1.i);
		System.out.println(obj.i+obj1.i);
	}
}







