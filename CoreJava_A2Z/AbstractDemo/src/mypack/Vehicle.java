package mypack;

public abstract  class Vehicle
{
	String vehicleType;
	int noOfWheels;
	String fuel;
	public Vehicle(String vehicleType, int noOfWheels, String fuel) {
		super();
		this.vehicleType = vehicleType;
		this.noOfWheels = noOfWheels;
		this.fuel = fuel;
	}
	static void show()
	{
		System.out.println("show");
	}
	void display()
	{
		System.out.println("display");
	}
	public Vehicle() {
		
		System.out.println("Vehicle()");
	}
	abstract int numberOfWheels();
	abstract String consumptionFuel(); 
	

	public static void main(String[] args)
	{
		Vehicle.show();

	}

}
