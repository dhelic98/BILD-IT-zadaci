package zadaci_07_03_2017;

public class Employee extends Person {
	// Data field
	private int office;
	private double salary;
	private MyDate date;

	public Employee(String name, String phone, String address, String email,
			int office, double salary) {
		// Constructor
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.date = new MyDate();

	}

	/** Return office */
	public int getOffice() {
		return office;
	}

	/** Return salaray */
	public String getSalary() {
		return String.format("%.2f", salary);
	}

	/** Return date hired */
	public String getDateHired() {
		return date.getMonth() + "/" + date.getDay() + "/" + date.getYear();
	}

	/** Set new office */
	public void setOffice(int office) {
		this.office = office;
	}

	/** Set new salary */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/** Set new dateHired */
	public void setDateHired() {
		date = new MyDate();
	}

	/** Return a string description of the class */
	public String toString() {
		return super.toString() + ", Office:" + office + ", Salary: $"
				+ getSalary() + ", Date hired:" + getDateHired();
	}

}
