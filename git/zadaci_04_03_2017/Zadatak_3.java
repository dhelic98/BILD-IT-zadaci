package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Large prime numbers) Write a program that finds five prime numbers
		 * larger than Long.MAX_VALUE.
		 */

		// Initializing bigdecimal as long.max value for easier comparison
		BigDecimal longmaxValue = new BigDecimal(Long.MAX_VALUE);

		long start = (long) Math.sqrt(Long.MAX_VALUE);
		BigDecimal number = new BigDecimal(start);
		int count = 0;

		while (count < 5) {
			if (isPrime((number).longValue())) {
				count++;
				System.out.println("Number " + number + " is prime");
			}
			number = number.add(BigDecimal.ONE);
		}
	}

	public static boolean isPrime(long n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
