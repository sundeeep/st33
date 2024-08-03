package mypack;

import java.util.StringTokenizer;

public class StringTokenizerDemo 
{

	public static void main(String[] args)
	{
	StringTokenizer token=new StringTokenizer("aWelcome to Indi based aon Indi Citizenship","ia",true);
	int i=token.countTokens();
	System.out.println(i);
	while(token.hasMoreTokens())
	{
		System.out.println(token.nextToken());
	}

}
}
