package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Print the characters in a string reversely) Write a recursive method
		 * that displays a string reversely on the console using the following
		 * header: public static void reverseDisplay(String value) For example,
		 * reverseDisplay("abcd") displays dcba. Write a test program that
		 * prompts the user to enter a string and displays its reversal.
		 */

		Scanner uInput = new Scanner(System.in);
		// Input by user
		System.out.println("Enter string you want to display in reverse");
		String string = uInput.nextLine();
		while (string.length() < 2) {
			System.out.println("Enter string longer than 1 character");
			string = uInput.nextLine();
		}
		System.out.println("Word backwards is ");
		reverseDisplay(string);
		uInput.close();
	}

	public static void reverseDisplay(String value) {
		// recursive method for printing out string backwards
		if (value.length() == 1) {
			System.out.print(value);
		} else {
			System.out.print(value.charAt(value.length() - 1));
			value = value.substring(0, value.length() - 1);
			reverseDisplay(value);
		}
	}

}
