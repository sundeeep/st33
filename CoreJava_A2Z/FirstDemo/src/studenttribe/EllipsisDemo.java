package studenttribe;

public class EllipsisDemo 
{
	
	void add()
	{
		int sum=0;
		sum=sum+30;
		System.out.println(sum);
	}
	void add(int... i)
	{
		int sum=0;
		for(int j=0;j<i.length;j++)
		{
			sum=sum+i[j];
			
		}
		System.out.println(sum);
	}
	public static void main(String[] args)
	{
		EllipsisDemo obj=new EllipsisDemo();
		obj.add(4);
		obj.add(77,33);
	}

}
