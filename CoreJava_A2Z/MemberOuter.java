class MemberOuter
{
	MemberOuter()
	{
		System.out.println("MemberOuter()");
	}
	void show()
	{
		//MemberInner obj=new MemberInner();
		//obj.display();
		System.out.println("Show");
	}
	class MemberInner
	{
		MemberInner()
		{
			System.out.println("MemberInner()");
		}
		void display()
		{
			System.out.println("display");
		}
	}
	public static void main(String[] ar)
	{
		MemberInner obj=new MemberOuter().new MemberInner();
		obj.display();
		obj.show();
	}
}