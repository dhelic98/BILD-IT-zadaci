package zadaci_17_03_2017;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Fibonacci numbers) Rewrite the fib method in Listing 18.2 using
		 * iterations. Hint: To compute fib(n) without recursion, you need to
		 * obtain fib(n - 2) and fib(n - 1) first. Let f0 and f1 denote the two
		 * previous Fibonacci
		 */
		Scanner uInput = new Scanner(System.in);
		//Input by user
		int index = methods.User_Input.positiveIntInput(uInput,
				"Enter index for fibonnacci number larger than 1");
		while (index <= 1) {
			index = methods.User_Input.positiveIntInput(uInput,
					"Enter index for fibonnacci number, larger than 1");
		}

		
		//Printing out result
		System.out.println("Fibonacci number for index " + index + " is "
				+ fib(index));

	}

	public static long fib(long index) {
		long f0 = 0; // For fib(0)
		long f1 = 1; // For fib(1)
		long currentFib = 0;

		if (index == 0)
			return f0;
		else if (index == 1)
			return f1;
		else {
			for (int i = 1; i < index; i++) {
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
			return currentFib;
		}
	}

}
