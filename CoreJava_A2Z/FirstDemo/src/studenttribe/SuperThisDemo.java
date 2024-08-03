package studenttribe;

public class SuperThisDemo
{
	int i,j;

	public SuperThisDemo() 
	{
		super();
	}

	public SuperThisDemo(int i) 
	{
		super();
		this.i = i;
	}

	public SuperThisDemo(int i, int j) 
	{
		this(56);
		this.i = i;
		this.j = j;
	}
	
}
