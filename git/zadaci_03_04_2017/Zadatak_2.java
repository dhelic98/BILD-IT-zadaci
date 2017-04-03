package zadaci_17_03_2017;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Compute greatest common divisor using recursion) The gcd(m, n) can
		 * also be defined recursively as follows: ■ If m % n is 0, gcd(m, n) is
		 * n. ■ Otherwise, gcd(m, n) is gcd(n, m % n). Write a recursive method
		 * to find the GCD. Write a test program that prompts the user to enter
		 * two integers and displays their GCD.
		 */

		Scanner uInput = new Scanner(System.in);
		// Input by user
		int number1 = methods.User_Input.positiveIntInput(uInput,
				"Enter first whole number");
		int number2 = methods.User_Input.positiveIntInput(uInput,
				"Enter second whole number");
		while (number1 < 1 || number2 < 1) {
			number1 = methods.User_Input.positiveIntInput(uInput,
					"Enter first whole number larger than 0");
			number2 = methods.User_Input.positiveIntInput(uInput,
					"Enter second whole number larger than 0");

		}

		// Calling method
		int gcd = gcd(number1, number2);
		// Printing out result
		System.out.println("Greatest common divisor for numbers " + number1
				+ " and " + number2 + " is " + gcd);

	}

	public static int gcd(int m, int n) {

		// recursive method for finding gcd

		if (m % n == 0) {
			return n;
		} else {
			return gcd(n, m % n);
		}

	}

}
