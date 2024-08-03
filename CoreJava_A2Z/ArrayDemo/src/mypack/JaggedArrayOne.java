package mypack;

import java.util.Scanner;

public class JaggedArrayOne
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int rows=sc.nextInt();//4
		int[][] arr=new int[rows][];//new int[4][];
		for(int i=0;i<arr.length;i++)//4
		{
			System.out.println("Enter the cols");
			arr[i]=new int[sc.nextInt()];//
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the elements in array");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Jagged array");
		for(int[] a:arr)
		{
			for(int i:a)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
