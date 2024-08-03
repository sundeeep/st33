class CloneTest extends CloneDemo
{
	CloneTest(int i,int j)
	{
		super(i,j);
	}
	public static void main(String[] a)
	{
		System.out.println("Welcome");
		try
		{
		CloneTest obj=new CloneTest(56,89);
		CloneTest obj1=(CloneTest)(obj.clone());
		obj1.show();
		}catch(Exception e){e.printStackTrace();}
	
	}
}