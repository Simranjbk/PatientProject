  package FirstProject.AssingmentProject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {

	@Id
	String firstName;
	String middleName;
	String lastName;
	String age;
	String contactNumber;
	String gender;
	String bloodTestResults;
	String urineTestResults;

	public Patient() {
		super();

	}

	public Patient(String firstName, String middleName, String lastName, String age, String contactNumber,
			String gender, String bloodTestResults, String urineTestResults) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.contactNumber = contactNumber;
		this.gender = gender;
		this.bloodTestResults = bloodTestResults;
		this.urineTestResults = urineTestResults;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodTestResults() {
		return bloodTestResults;
	}

	public void setBloodTestResults(String bloodTestResults) {
		this.bloodTestResults = bloodTestResults;
	}

	public String getUrineTestResults() {
		return urineTestResults;
	}

	public void setUrineTestResults(String urineTestResults) {
		this.urineTestResults = urineTestResults;
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", age="
				+ age + ", contactNumber=" + contactNumber + ", gender=" + gender + ", bloodTestResults="
				+ bloodTestResults + ", urineTestResults=" + urineTestResults + "]";
	}

}
