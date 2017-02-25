package zadaci_25_02_2017;

import java.util.Random;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * *7.13 (Random number chooser) Write a method that returns a random
		 * number between 1 and 54, excluding the numbers passed in the
		 * argument. The method header is specified as follows: public static
		 * int getRandom(int... numbers)
		 */
		Scanner uInput = new Scanner(System.in);
		while (true) {
			int size = methods.User_Input.positiveIntInput(uInput,
					"Please enter size of an array smaller than 30");
			// Condition for size of an array
			if (size > 30) {
				continue;
			}
			// Initalizing array
			int[] listOfNumbers = new int[size];

			// Inputing into array
			for (int i = 0; i < listOfNumbers.length; i++) {
				listOfNumbers[i] = methods.User_Input.positiveIntInput(uInput,
						"Enter " + (i + 1) + ". number");

			}
			// Getting random
			int randomNumber = getRandom(listOfNumbers);
			// Printing out result
			System.out.println("Your random number is " + randomNumber);
			break;
		}
		uInput.close();
	}

	public static int getRandom(int... numbers) {
		// Returning random number
		Random random = new Random();
		int number = -1;
		while (true) {
			number = random.nextInt(54) + 1;
			if (doesContaint(number, numbers)) {
				continue;
			} else {

				break;
			}
		}

		return number;

	}

	public static boolean doesContaint(int number, int... numbers) {
		// Method that checks if array contains number
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == number) {
				return true;
			}

		}
		return false;

	}

}
