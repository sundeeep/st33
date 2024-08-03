class MethodInitialize
{
	int studId=34;
	String studName="Ram";
	void show(int studId,String studName)
	{
		System.out.println("show(int studId,String studName)");
		this.studId=studId;
		this.studName=studName;
	}
	void display()
	{
		System.out.println(studId);
		System.out.println(studName);
	}
	public static void main(String[] a)
	{
		MethodInitialize obj=new MethodInitialize();
		obj.show(678,"Laasya");
		obj.show(123,"Sai");
		obj.display();
		
	}
}








