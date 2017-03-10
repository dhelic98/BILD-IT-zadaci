package zadaci_09_03_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (InputMismatchException) Write a program that prompts the user to
		 * read two integers and displays their sum. Your program should prompt
		 * the user to read the number again if the input is incorrect.
		 */
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				// Input by user
				System.out.println("Enter 1st number");
				int number1 = uInput.nextInt();
				System.out.println("Enter 2nd number");
				int number2 = uInput.nextInt();

				// Printing out result
				System.out.println("Sum of numbers is " + (number1 + number2));
				break;

			} catch (InputMismatchException ex) {
				// Exception handling
				System.out.println("Wrong input");
				uInput.nextLine();
			}

		} while (true);
		uInput.close();
	}

}
