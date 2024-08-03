package mypack;

import java.util.Arrays;

public class SortDemo
{

	public static void main(String[] args) 
	{
		Integer[] a= {9,29,-99,23,45,56,-9345};
		Arrays.sort(a);
		for(Integer i:a)
			System.out.println(i);		

	}

}
