class SwitchTest
{
	static void check(int i,String model)
	{
		System.out.println(i);
		switch(i)
		{
			case 1:{
						switch(model)
						{
							case "KTM": System.out.println(model);
									break;
						}
					}
		}
	}
	public static void main(String[] ar)
	{
		SwitchTest obj=new SwitchTest();
		obj.check(1,"KTM");
	}
}
	