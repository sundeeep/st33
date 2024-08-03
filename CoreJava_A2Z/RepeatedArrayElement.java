class RepeatedArrayElement
{
	public static void main(String[] ar)
	{
		int[] a={12,23,34,34,23,21};
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				count++;
			}
			System.out.println(a[i]+"  repeated"+count+" times");
		}
}
}