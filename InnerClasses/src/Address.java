
public class Address
{
	String street = "";
	String postcode = "";
	String city = "";
	
	public void setAddressValues(String street, String postcode, String city)
	{
		this.street = street;
		this.postcode = postcode;
		this.city = city;
	}
	
	public void displayAddressValues()
	{
		System.out.println("Street: " + street);
		System.out.println("Postcode: " + postcode);
		System.out.println("City: " + city);
	}
	
}
