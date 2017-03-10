package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Algebra: perfect square) Write a program that prompts the user to
		 * enter an integer m and find the smallest integer n such that m * n is
		 * a perfect square. (Hint: Store all smallest factors of m into an
		 * array list. n is the product of the factors that appear an odd number
		 * of times in the array list. For example, consider m = 90, store the
		 * factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of
		 * times in the array list. So, n is 10.)
		 */

		Scanner uInput = new Scanner(System.in);
		ArrayList<Integer> smallFactors = new ArrayList<>();

		while (true) {
			// Input by user
			int m = methods.User_Input.positiveIntInput(uInput, "Enter number");
			if (m < 1) {
				continue;
			}
			int n = 1;
			int divisor = 2;

			int temp = m;
			while (temp > 1) {
				// finding factors and adding to arrayList
				if (temp % divisor == 0) {
					smallFactors.add(divisor);

					temp /= divisor;
				} else {
					divisor++;
				}
			}

			int[] counts = new int[m + 1];

			for (int i = 0; i < smallFactors.size(); i++) {
				// count repetition of smallest factors
				counts[smallFactors.get(i)]++;
			}

			for (int i = 0; i < counts.length; i++) {
				if (counts[i] % 2 != 0) {
					// get a product of all smallest factors that repeat odd
					// times
					n *= i;
				}
			}

			// Printing out result
			System.out
					.println("The smallest number m for n to be a perfect square is "
							+ n);
			System.out.print("m * n is " + (m * n));
			break;

		}
		uInput.close();

	}

}
