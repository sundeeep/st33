class OuterInter
{
	interface InnerInter
	{
		default void display()
		{
			System.out.println("display");
		}
		void test();
		static void demo()
		{
			System.out.println("Demo");
		}
	}
	void show()
	{
		System.out.println("Show");
	}
	public static void main(String[] ar)
	{
		OuterInter obj=new OuterInter();
		obj.show();
		InnerInter.demo();
		//InnerInter obj2=new OuterInter().new InnerInter();
		InnerInter obj1=new InnerInter(){
			public void test(){
				System.out.println("test");
				}
			};//.new InnerInter();
		obj1.display();
		obj1.test();
		
	}
}