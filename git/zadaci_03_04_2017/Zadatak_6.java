package zadaci_17_03_2017;

import java.util.Scanner;

public class Zadatak_6 {
	private static long fib(int i) {
		// Increasing counting variable
		timesRepeated++;
		if (i == 0) { // base case
			return 0;
		} else if (i == 1) { // second base case
			return 1;
		} else {
			// recursion

			return fib(i - 1) + fib(i - 2);
		}
	}

	public static int timesRepeated = 0;

	public static void main(String[] args) {
		/*
		 * Fibonacci series) Modify Listing 18.2, ComputeFibonacci.java, so that
		 * the program finds the number of times the fib method is called.
		 * (Hint: Use a static variable and increment it every time the method
		 * is called.)
		 */

		Scanner uInput = new Scanner(System.in);
		// Input by user
		int index = methods.User_Input.positiveIntInput(uInput,
				"Enter index for fibonnacci number larger than 1");
		while (index <= 1) {
			index = methods.User_Input.positiveIntInput(uInput,
					"Enter index for fibonnacci number, larger than 1");
		}

		// Printing out result
		System.out.println("Fibonacci number for index " + index + " is "
				+ fib(index));
		System.out.println("Times repeated " + timesRepeated);

	}

}
