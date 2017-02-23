package zadaci_22_02_2017;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja ispisuje n x n matricu koristeći se sljedećim
		 * headerom: public static void printMatrix(int n). Svaki element u
		 * matrici je ili 0 ili 1, nasumično generisana. Napisati test program
		 * koji pita korisnika da unese broj n te mu ispiše n x n matricu u
		 * konzoli.
		 */

		// initializing scanner
		Scanner uInput = new Scanner(System.in);
		while (true) {
			// Calling method for int input
			int number = methods.User_Input.positiveIntInput(uInput,
					"Enter the size of matirx");

			if (number <= 1) {
				System.out.println("Input must be larger than 1");
				continue;
			} else if (number > 100) {
				System.out.println("Input must be smaller than 100");
				continue;
			}
			// calling method
			printMatrix(number);
			uInput.close();
			break;
		}

	}

	public static void printMatrix(int n) {
		// Mehtod for printing out matrix
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");

			}
			System.out.println();
		}
	}

}
