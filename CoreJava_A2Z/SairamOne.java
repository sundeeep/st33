package yourpack;
import mypack.*;
class SairamOne extends Sandeep
{
	int i=90,j=40;
	SairamOne()
	{
	}
	SairamOne(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public static void main(String[] a)
	{
		SairamOne obj=new SairamOne();
		obj.display();
		SairamOne obj1=new SairamOne(1,3);
		obj.display();
		String[] ar={"Hai"};
		Sandeep.main(ar);
	}
}