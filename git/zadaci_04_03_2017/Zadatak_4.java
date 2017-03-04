package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Mersenne prime) A prime number is called a Mersenne prime if it can
		 * be written in the form 2p - 1 for some positive integer p. Write a
		 * program that finds all Mersenne primes with p … 100 and displays the
		 * output as shown below. (Hint: You have to use BigInteger to store the
		 * number, because it is too big to be stored in long. Your program may
		 * take several hours to run.) p 2^p – 1 2 3 3 7 5 31 ...
		 */
		// Printing out title
		System.out.printf("%-10s%7s\n", "P", "2 * P -1");
		int numberOfPrimes = 0;
		// loop that findes 100 numbers
		for (int i = 2; numberOfPrimes < 100; i++) {
			if (isPrime(i)) {
				numberOfPrimes++;
				System.out.printf("%-10d%-10s\n", i, getMersennePrime(i));
			}
		}

	}

	public static boolean isPrime(long n) {
		// Method that returns if number is prime

		long square = (long) Math.sqrt(n);
		for (int i = 2; i <= square; i++) {

			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static BigDecimal getMersennePrime(int p) {
		// Method that returnds 2^P-1

		return new BigDecimal(2).pow(p).subtract(BigDecimal.ONE);
	}

}
