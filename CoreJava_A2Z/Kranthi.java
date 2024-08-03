class Purandhar
{
	int i=90;
	private Purandhar()
	{
		System.out.println("Purandhar()");
	}
	protected Purandhar(int i)
	{
		this.i=i;
		System.out.println("Purandhar(int i)");
		
	}
}
class Kranthi extends Purandhar
{
	Kranthi()
	{
		super(12);
		System.out.println("Kranthi()");
	}
	public static void main(String[] ar)
	{
		Kranthi k1=new Kranthi();
		System.out.println(k1.i);
		k1.i=k1.i+345;
		System.out.println(k1.i);
	}
}