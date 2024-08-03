package mypack;

import java.util.Scanner;

public class ArrayTestDemo
{
	int[] show(int[] a)
	{
		return a;
	}
	public static void main(String[] args) 
	{
		ArrayTestDemo obj=new ArrayTestDemo();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the arr1");
		int sizeArr1=sc.nextInt();//5

		int arr1[]=new int[sizeArr1];//int arr1[]=new int[5];
		System.out.println("Load the values to the arr1");
		for(int i=0; i<sizeArr1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int[] b=obj.show(arr1);
		for(int i:b)
			System.out.print(i+" ");
		 
		
	}

}
