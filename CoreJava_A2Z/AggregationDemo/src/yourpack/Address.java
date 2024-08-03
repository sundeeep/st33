package yourpack;

public class Address
{
	public int doorNo;
	public String streetName;
	public String city;
	public String country;
	public Address()
	{
		super();
	}
	public Address(int doorNo, String streetName, String city, String country) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + ", country=" + country
				+ "]";
	}
	
}
