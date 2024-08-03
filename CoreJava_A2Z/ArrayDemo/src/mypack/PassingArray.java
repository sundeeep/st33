package mypack;

import java.util.Scanner;

public class PassingArray
{
	int[] a;
	PassingArray(int[] a)
	{
		this.a=a;
	}
	void show()
	{
		for(int i:a)System.out.print(i+"  ");
			System.out.println("Welcome");
	
	}
	/*void show(int a[])
	{
		int sum=0;
		for(int i: a)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	}*/
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the arr1");
		int sizeArr1=sc.nextInt();//5

		int arr1[]=new int[sizeArr1];//int arr1[]=new int[5];
		System.out.println("Load the values to the arr1");
		for(int i=0; i<sizeArr1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		PassingArray obj=new PassingArray(arr1);
		obj.show();
		int a[]= {};
		a[-1]=23;
		//obj.show(obj.a);

	}

}
