package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Sum the digits in an integer using recursion) Write a recursive
		 * method that computes the sum of the digits in an integer. Use the
		 * following method header: public static int sumDigits(long n) For
		 * example, sumDigits(234) returns 2 + 3 + 4 = 9. Write a test program
		 * that prompts the user to enter an integer and displays its sum.
		 */

		// Create a Scanner
		Scanner uInput = new Scanner(System.in);

		// Prompt the user to enter an integer
		while (true) {
			try {
				System.out.print("Enter an integer: ");
				long n = uInput.nextLong();

				// Display the sum
				System.out.println("The sum of digits of " + n + " = " + sumDigits(n));
				break;
			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}
		}
		uInput.close();
	}

	/* Method sums the digits in an integer */
	public static int sumDigits(long n) {
		return sumDigits(n, 0);
	}

	/* Helper overloaded method */
	private static int sumDigits(long n, int sum) {
		if (n == 0) // Base case
			return sum;
		else
			// Recursive call
			return sumDigits(n / 10, sum + (int) (n % 10));
	}

}
