abstract class Annoy
{
	int i;
	Annoy()
	{
		System.out.println("Annoy");
	}
	Annoy(int i)
	{
			System.out.println("Annoy(int i)");
	}
	
	void show()
	{
		System.out.println("show");
	}
	public static void main(String[] ar)
	{
		Annoy obj=new Annoy()
		{
			
			{	
			super(6);
				System.out.println("Annoy SubClass");
			}//Nested class which is  subclass of Annoy and obj is reference of Annoy 
		void display(){System.out.println("display");}
		void show(){System.out.println("SubShow");
					method();
					String[] str={};
					main(str);
				}
		static void method(){System.out.println("Metod");}
		public static void main(String[] ar)
		{
			System.out.println("Hi");
		}};
		obj.show();//obj.display();
	//	obj.method();
	}
}