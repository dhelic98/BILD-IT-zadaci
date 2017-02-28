package zadaci_28_02_2017;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 9.7 (The Account class) Write a test program that creates an Account
		 * object with an account ID of 1122, a balance of $20,000, and an
		 * annual interest rate of 4.5%. Use the withdraw method to withdraw
		 * $2,500, use the deposit method to deposit $3,000, and print the
		 * balance, the monthly interest, and the date when this account was
		 * created.
		 */
		// Creating object
		Account acc = new Account(1122, 20000.00);
		// Working with object
		acc.setAnnualInterestRate(4.5);
		acc.withdraw(2500);
		acc.deposit(3000);

		// Printing out the result
		System.out.println(acc.toString());
		System.out.println("Monthly interest rate is $" + acc.getMonthlyInterest());

	}

}
