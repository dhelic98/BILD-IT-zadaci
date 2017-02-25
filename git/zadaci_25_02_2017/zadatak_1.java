package zadaci_25_02_2017;

import java.util.Random;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 7.7(Count single digits) Write a program that generates 100 random
		 * integers between 0 and 9 and displays the count for each number.
		 * (Hint: Use an array of ten integers, say counts, to store the counts
		 * for the number of 0s, 1s, . . . , 9s.)
		 */

		// Initializing arrays
		int[] list = new int[100];
		int[] count = new int[10];
		// Initializing random.util
		Random random = new Random();
		int number = 0;
		// Generating random numbers from 0-9
		for (int i = 0; i < 100; i++) {
			list[i] = random.nextInt(10);
			// counting
			count[list[i]]++;
		}
		// Printing out the result
		System.out
				.println("100 numbers are generated from 0-9 they are repeated:");
		for (int i = 0; i < count.length; i++) {
			System.out
					.println("Number " + i + " has been repeated " + count[i]);
		}

	}
}
