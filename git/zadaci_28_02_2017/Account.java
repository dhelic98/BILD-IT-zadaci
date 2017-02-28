package zadaci_28_02_2017;

import java.util.Date;

public class Account {
	// Data fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public Account() {

	}

	Account(int id, double balance) {
		// Initializing account object
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();

	}

	// Generating getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		// Method that returns account info
		return "Account [id=" + id + ", balance=" + balance
				+ ", annualInterestRate=" + annualInterestRate
				+ ", dateCreated=" + dateCreated + "]";
	}

	public double getMonthlyInterestRate() {
		return (this.annualInterestRate / 100) / 12;

	}

	public double getMonthlyInterest() {
		return this.balance * getMonthlyInterestRate();

	}

	public void withdraw(double ammount) {
		this.balance += ammount;

	}

	public void deposit(double ammount) {
		this.balance += ammount;

	}

}
