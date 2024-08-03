package mypack;

public class PetrolCar extends Car
{
	String consumptionFuel()
	{
		System.out.println("It is petrol Consuming Car");
		return "Petrol";
	}
	public static void main(String[] args) 
	{
		PetrolCar pc=new PetrolCar();
		pc.display();
		System.out.println(pc.numberOfWheels());
		System.out.println(pc.consumptionFuel());
		Vehicle.show();
		
	}

}
