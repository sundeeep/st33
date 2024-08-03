class LeapYear
{
	public static void main(String[] a)
	{
		int year=1996;
		if((year%400==0)||((year%4==0)&&(year%100!=0)))
			System.out.println("LeapYear");
		else
			System.out.println("notLeapYear");
	}
}