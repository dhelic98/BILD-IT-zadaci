package zadaci_16_03_2017;

import java.math.BigInteger;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Use the Rational class) Write a program that computes the following
		 * summation series using the Rational class: 1 2 + 2 3 + 3 4 + c + 98
		 * 99 + 99 100 You will discover that the output is incorrect because of
		 * integer overflow (too large). To fix this problem, see Programming
		 * Exercise 13.15.
		 */

		// Create a Rational object
		BigIntRational r = new BigIntRational(BigInteger.ONE, new BigInteger(
				"2"));

		// Add a series of Rationol objects to r
		for (BigInteger i = r.getNumerator().add(BigInteger.ONE); i
				.compareTo(new BigInteger("100")) <= 0; i = i
				.add(BigInteger.ONE)) {
			r = r.add(new BigIntRational(i, i.add(BigInteger.ONE)));
		}

		// Display results
		System.out.println(r);
	}

}
