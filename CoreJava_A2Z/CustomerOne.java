class CustomerOne implements Cloneable
{
	int custId;
	String custName;
	int phoneNo;
	CustomerOne(int custId,String custName,int phoneNo)
	{
		this.custId=custId;
		this.custName=custName;
		this.phoneNo=phoneNo;
		
	}
	public String toString()
	{
		return custId+"  "+custName+" "+phoneNo;
	}
	public static void main(String[] ar) throws CloneNotSupportedException
	{
		CustomerOne c1=new CustomerOne(34,"Ravi",3454534);
	//	try
	//	{
		CustomerOne c2=(CustomerOne)c1.clone();
	//	}catch(Exception e){e.printStackTrace();}
		System.out.println("Back to Main");
	}
}