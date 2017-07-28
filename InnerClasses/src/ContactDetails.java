
public class ContactDetails
{
	String email = "";
	String telephoneNumber = "";
	Address homeAddress = new Address();
	
	public void setContactDetails(String email, String phoneNumber)
	{
		this.email = email;
		this.telephoneNumber = phoneNumber;
		this.homeAddress.setAddressValues("Crysler street", "NP19 1QR", "Newport");
	}
	
	public void displayContactDetails()
	{
		System.out.println("Email address: " + email);
		System.out.println("Phone number:" + telephoneNumber);
		this.homeAddress.displayAddressValues();
	}
	
}
