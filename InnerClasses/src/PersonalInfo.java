
public class PersonalInfo
{
	Exams examResults = new Exams();
	Office studentsOffice = new Office();
	ContactDetails contactDetails = new ContactDetails();

	public static void main(String[] args)
	{
		PersonalInfo studentOne = new PersonalInfo();
		studentOne.examResults.setResults(77, 68, 60);
		studentOne.examResults.calculate();
		studentOne.examResults.displayResults();
		studentOne.contactDetails.setContactDetails("jamescburr94@gmail.com", "07367 829 617");
		studentOne.contactDetails.displayContactDetails();
		studentOne.studentsOffice.setOfficeInformation("N67 YB 88273U", "43", "Top band");
		studentOne.studentsOffice.displayOfficeInformation();
	}

}
