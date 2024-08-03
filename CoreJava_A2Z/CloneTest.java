class CloneDemo implements Cloneable
{
	int i=90,j=120;
	CloneDemo(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	void show()
	{
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] a)
	{
		System.out.println("Welcome");
		try
		{
		CloneDemo obj=new CloneDemo(34,23);
		CloneDemo obj1=(CloneDemo)(obj.clone());
		obj1.show();
		}catch(Exception e){e.printStackTrace();}
	
	}
}
