package mypack;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of the arr1");
		int sizeArr1=sc.nextInt();

		System.out.println("Load the values to the arr1");
		int arr1[]=new int[sizeArr1];
		
		for(int i=0; i<sizeArr1;i++)
		{
			arr1[i]=sc.nextInt();
		}

		System.out.println("Enter the size of the arr2");
		int sizeArr2=sc.nextInt();

		System.out.println("Load the values to the arr2");
		int arr2[]=new int[sizeArr2];

		
		for(int i=0; i<sizeArr2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.toString(arr2));


	}
}
