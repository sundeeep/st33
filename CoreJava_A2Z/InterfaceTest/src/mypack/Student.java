package mypack;

public class Student //implements Cloneable 
{
	int studId;
	String studName;

	public Student(int studId, String studName) {
		super();
		this.studId = studId;
		this.studName = studName;
	}

	public static void main(String[] args)
	{
		Student s1=new Student(123,"Shashank");
		try {
			Student o1=(Student)s1.clone();
			System.out.println(o1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + "]";
	}

}
