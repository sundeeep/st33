class Customer
{
	int custId=90;
	String custName="Lokesh";
	String product;
	int quantity;
	
	Customer(int custId)
	{
		System.out.println("Customer(int id)");
		this.quantity=custId;
	}
	void Customer(int custId,String custName)
	{
		System.out.println("Customer(int custId,String custName)");
		this.custId=custId;
		this.custName=custName;
		this.quantity=90;
	}
	void show()
	{
		System.out.println(custId);
		System.out.println(custName);
		System.out.println(product);
		System.out.println(quantity);
	}
	public static void main(String[] ar)
	{
		Customer c1=new Customer();
		//c1.show();
		Customer c2=new Customer(234);
		c2.Customer();
	//	c2.show();
		Customer c3=new Customer(456,"ravi");
		c3.show();
	}
	
}






