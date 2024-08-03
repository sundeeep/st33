public class StudentOne
{
	int studId;
	String studName;
	String Qualification;
	static String college="CMR";
	StudentOne()
	{
		System.out.println("hai");
	}
	StudentOne(int studId,String studName)
	{
		this.studId=studId;
		this.studName=studName;
	}
	StudentOne(StudentOne s)
	{
		this.studId=s.studId;
		this.studName=s.studName;
		this.Qualification=s.Qualification;
	}
	public String toString()
	{
		return studId+"  "+studName+ "  "+college;
	}
	public static void main(String[] ar)
	{
		StudentOne s2=new StudentOne(356,"Raj");
		System.out.println(s2);
		StudentOne s1=new StudentOne(345,"Ram");
		System.out.println(s1);
		StudentOne s3=new StudentOne(s2);
		System.out.println(s3);
	}
}