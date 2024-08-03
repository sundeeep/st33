interface First
{
	void show();
	
}
interface Second extends First
{
	void display();
}
interface Third //extends First
{
	void test();
}
class DemoThird implements Third
{
	public void show()
	{
		System.out.println("Show");
	}
	public void display()
	{
		System.out.println("display");
	}
	public void test()
	{
		System.out.println("test");
	}
	public static void main(String[] ar)
	{
		Third dt=new DemoThird();
		Second st=(Second)dt;
		st.show();
		st.test();
		st.display();
	}
}
