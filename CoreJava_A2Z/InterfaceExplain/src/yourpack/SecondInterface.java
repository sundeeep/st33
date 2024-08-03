package yourpack;
import mypack.*;
public interface SecondInterface extends FirstInterface
{
	int i=45;
	void show();
	default void second()
	{
		//test();
		//demo();
		System.out.println("Second");
	}
	default void demo()
	{
		FirstInterface.super.demo();
		System.out.println("SecondDemo");
	}
}
