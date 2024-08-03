class MethodOver
{
	private void show()
	{
		System.out.println("supershow");
	}
}
class MethodOverride extends MethodOver
{
	private void show()
	{
		//super.show();
		System.out.println("SubShow");
	}
	public static void main(String[] ar)
	{
		MethodOverride obj=new MethodOverride();
		obj.show();
	}
}