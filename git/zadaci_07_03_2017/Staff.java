package zadaci_07_03_2017;

public class Staff extends Employee {
	private String title;

	// Constructor
	Staff(String name, String phoneNumber, String address, String eMail,
			int office, double salary, String title) {
		super(name, phoneNumber, address, eMail, office, salary);
		this.title = title;

	}

	// Getter and setter method
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return super.toString() + ", Title:" + this.title;
	}

}
