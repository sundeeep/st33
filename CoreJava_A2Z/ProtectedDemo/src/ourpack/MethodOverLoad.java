package ourpack;

public class MethodOverLoad 
{
	int sum=0;
	void show()
	{
		System.out.println("show()");
	}
	void show(int... i)
	{
		for(int j=0;j<=i.length-1;j++)
		{
			 sum=sum+i[j];
		}
		System.out.println(sum);
		
	}
	/*
	void show(int i)
	{
		System.out.println("show(int i)");
	}
	int show(int i,int j)
	{
		System.out.println("Show(int i,int j)");
		return 90;
	}*/
	public static void main(String[] args) {
		MethodOverLoad obj=new MethodOverLoad();
		obj.show();
		obj.show(34);
		obj.show(23,6);

	}

}
