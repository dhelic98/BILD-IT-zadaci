package zadaci_17_03_2017;

public class Zadatak_3 {

	public static double sum(double m) {
		if (m == 1) {
			// Base case
			return 1;
		} else {
			// Recursion
			return 1 / m + sum(m - 1);
		}

	}

	public static void main(String[] args) {
		/*
		 * (Sum series) Write a recursive method to compute the following
		 * series: m(i) = 1 + 1 2 + 1 3 + c + 1 i Write a test program that
		 * displays m(i) for i = 1, 2, . . ., 10.
		 */

		// Display m(i) for i = 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.println("m(" + i + ")= " + sum(i));
		}

	}

}
