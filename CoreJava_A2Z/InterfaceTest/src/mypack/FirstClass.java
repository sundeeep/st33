package mypack;

class FirstClass implements FirstInterface {

	int i=89;
	@Override
	public void show()
	{
	System.out.println("Hai dears");
	System.out.println(this.i);
	System.out.println(FirstInterface.i);
//	FirstInterface.i=i*79;
	System.out.println(i);

	}
	public void display()
	{
		System.out.println("Get Last");
		test();
	}
	
	public void demo()
	{
		System.out.println("Bye dears");
		
	}
	public static void main(String[] args) {
		FirstInterface obj=new FirstClass();
	//	obj.show();
		obj.display();
		//obj.test();
	}

}
