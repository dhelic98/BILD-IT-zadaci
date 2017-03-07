package zadaci_07_03_2017;

public class Person {
	private String fullName;
	private String phoneNumber;
	private String adress;
	private String eMail;

	public Person() {
		// No args
		this("Unknown", "Unknown", "Unknown", "Unknown");
	}

	Person(String fullName, String phoneNumber, String address, String eMail) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.adress = address;
		this.eMail = eMail;

	}

	// Getters and setters
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	// to string method that returns information about object
	public String toString() {
		return "Name:" + this.fullName + ", phonenumber:" + this.phoneNumber
				+ ", adress:" + this.adress + ", e-mail adress:" + this.eMail;
	}

}
