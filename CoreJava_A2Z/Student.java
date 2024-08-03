class Student
{
	int studId=123;
	String studName="Mohammed";
	static void show()
	{
		System.out.println(studId);
		System.out.println(studName);
	}

	public static void main(String[] ar)
	{
		Student obj=new Student();
		Student obj1=new Student();
		obj.show(); 
		System.out.println(obj.studId+(obj1.studId*2));
		System.out.println(obj.studName);
	}
}
	
	
	
	
	
	
	