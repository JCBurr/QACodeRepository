
public class Office
{
	String nationalInsuranceNumber = "";
	String salary = "";
	String grade = "";
	Address officeAddress = new Address();

	public void setOfficeInformation(String nationalInsurance, String salary, String grade)
	{
		this.nationalInsuranceNumber = nationalInsurance;
		this.salary = salary;
		this.grade = grade;
		this.officeAddress.setAddressValues("Chimegrove road", "CF19 7XT", "Cardiff");
	}

	public void displayOfficeInformation()
	{
		System.out.println("National Insurance Number: " + nationalInsuranceNumber);
		System.out.println("Salary: £" + salary );
		System.out.println("Grade: " + grade);
		officeAddress.displayAddressValues();
	}
	
}
