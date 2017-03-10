package zadaci_09_03_2017;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * *12.4 (IllegalArgumentException) Modify the Loan class in Listing
		 * 10.2 to throw IllegalArgumentException if the loan amount, interest
		 * rate, or number of years is less than or equal to zero.
		 */

		// Testing class loan
		try {
			Loan loan = new Loan(4.35, 4, 2000);

			System.out.printf("Total payment: %2.2f", loan.getTotalPayment());
		} catch (IllegalArgumentException ex) {
			System.out.println("Wrong input");
		}

	}

}
