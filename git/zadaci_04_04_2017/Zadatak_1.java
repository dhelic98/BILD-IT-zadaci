package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * (Print the digits in an integer reversely) Write a recursive method
		 * that displays an int value reversely on the console using the
		 * following header: public static void reverseDisplay(int value) For
		 * example, reverseDisplay(12345) displays 54321. Write a test program
		 * that prompts the user to enter an integer and displays its reversal.
		 */

		Scanner uInput = new Scanner(System.in);

		while (true) {
			// Input by user
			int number = methods.User_Input.positiveIntInput(uInput,
					"Enter number larger than 10 you want to display reversed");
			if (number < 10) {
				continue;
			}
			// Printing number backwards
			System.out.print("Reverse number is ");
			reverseDisplay(number);

			break;

		}
		uInput.close();

	}

	public static void reverseDisplay(int value) {
		// recursive method for displaying number backwards
		if (value < 10) {
			System.out.print(value);
		}

		else {
			System.out.print(value % 10);
			reverseDisplay(value / 10);
		}

	}

}
