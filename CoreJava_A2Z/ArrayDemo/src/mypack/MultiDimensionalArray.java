package mypack;

import java.util.Scanner;

public class MultiDimensionalArray
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the row of the arr1");
		int sizeArr1=sc.nextInt();//2
		System.out.println("Enter the column of the arr1");
		int sizeArr2=sc.nextInt();//3
		int arr1[][]=new int[sizeArr1][sizeArr2];//int arr1[]=new int[5];
		System.out.println("Load the values to the arr1");
		for(int i=0; i<sizeArr1;i++)//0 to 2
		{
			for(int j=0;j<sizeArr2;j++)//0 to 3
			{	
			arr1[i][j]=sc.nextInt();//arr1[0][0],arr1[0][1],arr1[0][2]
			}
		}
		System.out.println(arr1[1][1]);

	}

}
