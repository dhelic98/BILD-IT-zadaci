package zadaci_03_03_2017;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Displaying the prime numbers) Write a program that displays all the
		 * prime numbers less than 120 in decreasing order. Use the
		 * StackOfIntegers class to store the prime numbers (e.g., 2, 3, 5, ...)
		 * and retrieve and display them in reverse order.
		 */

		StackOfIntegers stack = new StackOfIntegers();
		// Loop that goes from 120 to 1 and finds if number is prime
		for (int i = 120; i > 1; i--) {
			if (isPrime(i)) {
				stack.add(i);
			}
		}
		// Printing out result
		System.out.print("Prime numbers lower than 120 are ");
		stack.print();
	}

	public static boolean isPrime(int n) {
		// method that finds if numbers are prime
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

}
