package mypack;

import java.util.Scanner;

public class ArrayTest
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int j=sc.nextInt();//5
		int[] a= new int[j];
		//int[] a=new int[5];
		
		for(int i=0;i<=j;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=j-1;i>=2;i--)
			System.out.print(a[i]+" ");
			
		}
	}


