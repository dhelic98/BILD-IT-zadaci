package zadaci_17_03_2017;

public class Zadatak_4 {

	private static double sum(double i) {
		if (i == 1) { // base case
			return i / (i * 2 + 1);
		} else {
			// recursion
			return i / (i * 2 + 1) + sum(i - 1);
		}
	}

	public static void main(String[] args) {
		/*
		 * (Sum series) Write a recursive method to compute the following
		 * series: m(i) = 1 3 + 2 5 + 3 7 + 4 9 + 5 11 + 6 13 + c + i 2i + 1
		 * Write a test program that displays m(i) for i = 1, 2, . . ., 10.
		 */

		// Printing out m(i) from 1 to 10
		for (int i = 1; i <= 10; i++) {
			System.out.print("m(" + i + ")=");
			System.out.printf("%4.3f", sum(i));
			System.out.println();

		}
	}

}
