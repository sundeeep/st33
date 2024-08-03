package mypack;

public class ArrayOne
{

	public static void main(String[] args) 
	{
		int k=2;
		int x=2;
		int[] a= {34,56,78,90,100};
		int sum=0;
		for(int i:a)//for each i in a i is int type
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println(sum);
		int b[]=a.clone();
		for(int j:b)
			System.out.print(j+"  ");
		System.out.println(a==b);
		System.out.println(k==x);
	}

}
