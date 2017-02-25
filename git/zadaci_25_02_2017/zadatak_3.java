package zadaci_25_02_2017;

import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 7.30 (Pattern recognition: consecutive four equal numbers) Write the
		 * following method that tests whether the array has four consecutive
		 * numbers with the same value. public static boolean
		 * isConsecutiveFour(int[] values) Write a test program that prompts the
		 * user to enter a series of integers and displays if the series
		 * contains four consecutive numbers with the same value. Your program
		 * should first prompt the user to enter the input size—i.e., the number
		 * of values in the series
		 */
		Scanner uInput = new Scanner(System.in);

		while (true) {
			// Input size of array
			int size = methods.User_Input.positiveIntInput(uInput,
					"Please enter size of an array smaller than 15");
			// Condition for size of an array
			if (size > 15) {
				continue;
			}
			// Initalizing array
			int[] listOfNumbers = new int[size];
			// Inputing into array
			for (int i = 0; i < listOfNumbers.length; i++) {
				listOfNumbers[i] = methods.User_Input.positiveIntInput(uInput,
						"Enter " + (i + 1) + ". number");

			}
			// Printing out the result
			if (isConsecutiveFour(listOfNumbers)) {
				System.out.println("This list contains 4 consecutive numbers");
			} else {
				System.out
						.println("This list does not contain 4 consecutive numbers");
			}
			break;
		}
		uInput.close();
	}

	public static boolean isConsecutiveFour(int[] values) {
		// Method that checks if array contains 4 consecutive numbers
		int number = 0;
		if (values.length < 4) {
			return false;
		}
		for (int i = 0; i < values.length - 3; i++) {
			number = values[i];
			if ((values[i + 1] == number) && (values[i + 2] == number)
					&& (values[i + 3] == number)) {
				return true;

			}

		}

		return false;

	}

}
