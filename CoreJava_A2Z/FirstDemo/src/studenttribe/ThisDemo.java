package studenttribe;

public class ThisDemo extends SuperThisDemo
{
	int k;
	public ThisDemo(int i, int j,int k)
	{
		super(i,j);
		this.k = k;
	}

	
	
	@Override
	public String toString() {
		return "ThisDemo [k=" + k + ", i=" + i + ", j=" + j + "]";
	}



	public ThisDemo(int k) {
		super();
		this.k = k;
	}

	public ThisDemo() {
		super();
	}

	public static void main(String[] args)
	{
		ThisDemo obj=new ThisDemo(1,2,3);
		System.out.println(obj);
	}

}
