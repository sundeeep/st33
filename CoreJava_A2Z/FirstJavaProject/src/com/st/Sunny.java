package com.st;

public class Sunny
{

	public static void main(String[] args) 
	{
		int num=14;
		int temp=num+1;
		for(int i=temp/4;i>=1;i--)
		{
			
			
			if(i*i==temp)
			{
				System.out.println("The given number is sunny number");
				break;
			}
			else if(i*i)
				System.out.println("not sunny");
			
			
			
		}
		//System.out.println(temp);
	}

}