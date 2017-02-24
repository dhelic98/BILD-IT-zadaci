package zadaci_24_02_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji učitava 10 brojeva te ispisuje koilko je
		 * jedinstvenih brojeva unijeto te sve jedinstvene brojeve koji su
		 * unijeti, razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje
		 * više puta, broj treba ispisati samo jednom.
		 */
		Scanner uInput = new Scanner(System.in);
		int[] list = new int[10];
		int number = 0;

		// Input by user
		System.out.println("Enter 10 numbers");
		for (int i = 0; i < list.length; i++) {
			list[i] = methods.User_Input.positiveIntInput(uInput, "Enter "
					+ (i + 1) + ". number");

		}
		int counter = 0;
		// loop that checks if number is unique
		for (int i = 0; i < list.length; i++) {
			if (isUnique(list, list[i], i)) {
				System.out.print(list[i] + " ");
				counter++;

			}

		}
		// Printing out the result
		System.out.println("\nThere is/are " + counter + " unique numbers");
		uInput.close();

	}

	public static boolean isUnique(int[] list, int number, int index) {
		for (int i = 0; i < list.length; i++) {
			if (i == index) {
				continue;
			}
			if (list[i] == (number)) {
				return false;
			}
		}

		return true;
	}
}
