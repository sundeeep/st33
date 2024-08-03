package mypack;

public class OverrideInherit extends OverrideTest
{
	String str="Gopi";
	private void show(int i)
	{
		System.out.println("Bharath");
		System.out.println(str);
		System.out.println(super.str);
	//super.show(30);
	}
	final public static void main(String[] args)
	{
	//	OverrideTest obj1=new OverrideTest();
	//	obj1.show(12);
		OverrideInherit obj=new OverrideInherit();
		obj.show(12);
		System.out.println(obj.str);

	}

}
