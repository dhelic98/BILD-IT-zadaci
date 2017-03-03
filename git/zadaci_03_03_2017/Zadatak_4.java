package zadaci_03_03_2017;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Displaying the prime factors) Write a program that prompts the user
		 * to enter a positive integer and displays all its smallest factors in
		 * decreasing order. For example, if the integer is 120, the smallest
		 * factors are displayed as 5, 3, 2, 2, 2. Use the StackOfIntegers class
		 * to store the factors (e.g., 2, 2, 2, 3, 5) and retrieve and display
		 * them in reverse order.
		 */
		StackOfIntegers stack = new StackOfIntegers();

		Scanner uInput = new Scanner(System.in);
		// Input by user
		int number = methods.User_Input.positiveIntInput(uInput,
				"Enter number please");
		int tempNumber = number;
		// Loop that is calling method and finding elements of inputed number
		while (number >= 2) {
			int smallDivisor = returnSmallestelement(number);

			stack.add(smallDivisor);
			number /= smallDivisor;

		}
		// Printing out result
		System.out.print("Elements for number " + tempNumber + " are ");
		stack.print();

	}

	public static int returnSmallestelement(int number) {
		// method that returns smallest element
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return i;
			}
		}
		return number;

	}
}
