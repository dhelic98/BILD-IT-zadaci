package zadaci_23_02_2017;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji pita korisnika da unese cijeli broj te
		 * ispisuje piramidu svih brojeva do tog broja. (Na primjer, ukoliko
		 * korisnik unese 7 vrh piramide je broj 1, red ispod vrha piramide je 2
		 * 1 2, red ispod je 3 2 1 2 3, red ispod 4 3 2 1 2 3 4 itd.)
		 */

		Scanner uInput = new Scanner(System.in);
		while (true) {
			// Calling method for int input
			int number = methods.User_Input.positiveIntInput(uInput,
					"Enter the size of matirx");

			if (number <= 1) {
				System.out.println("Input must be larger than 1");
				continue;
			} else if (number > 25) {
				System.out.println("Input must be smaller than 25");
				continue;
			}
			// calling method
			printPyramid(number);
			uInput.close();
			break;
		}
	}

	public static void printPyramid(int number) {
		// Method for printing out pyramid
		for (int i = 1; i <= number; i++) {
			for (int j = number; j > i; j--) {
				System.out.print("   ");
			}
			for (int k = i; k > 0; k--) {
				System.out.print(" " + k + " ");

			}
			for (int l = 2; l <= i; l++) {
				System.out.print(" " + l + " ");

			}

			System.out.println();

		}
	}
}
