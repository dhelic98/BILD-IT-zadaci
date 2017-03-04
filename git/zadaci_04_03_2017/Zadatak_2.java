package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Square numbers) Find the first ten square numbers that are greater
		 * than Long.MAX_VALUE. A square number is a number in the form of n2.
		 * For example, 4, 9, and 16 are square numbers. Find an efficient
		 * approach to run your program fast.
		 */
		// Initializing bigdecimal as long.max value for easier comparison
		BigDecimal longmaxValue = new BigDecimal(Long.MAX_VALUE);

		long start = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal number = new BigDecimal(start);
		int count = 0;
		// Loop that counts number of times printed
		while (count < 10) {
			BigDecimal square = number.multiply(number);

			if (square.compareTo(longmaxValue) > 0) {
				count++;
				System.out.println(number + " is squared " + square);

			}
			// increasing number
			number = number.add(BigDecimal.ONE);
		}

	}

}
