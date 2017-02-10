package zadaci_10_02_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Nizovi niz1 i niz2 su striktno identični ukoliko su svi njihovi
		 * elementi na istim pozicijama jednaki. Napisati metodu koja vraća true
		 * ukoliko su nizovi niz1 i niz2 striktno identični. Koristiti sljedeći
		 * header:
		 * 
		 * public static boolean equals(int[ ] niz1, int[ ] niz2)
		 * 
		 * Napisati testni program koji pita korisnika da unese dva niza cijelih
		 * brojeva te provjerava da li su striktno identični.
		 */

		Scanner uInput = new Scanner(System.in);
		try {
			// Unos od strane korisnika/odredjivanje velicine array-a
			System.out.println("Enter the size of array");
			int arraySize = uInput.nextInt();
			// Deklarisanje arraya
			int[] list1 = new int[arraySize];
			int[] list2 = new int[arraySize];

			// Unos u prvi array
			System.out.println("Input into 1st array");

			for (int i = 0; i < list1.length; i++) {
				System.out.println("Enter number");
				list1[i] = uInput.nextInt();

			}

			// Unos u drugi array
			System.out.println("Input into 2nd array");
			for (int i = 0; i < list2.length; i++) {
				System.out.println("Enter number");
				list2[i] = uInput.nextInt();

			}

			// Pozivanje metode

			System.out.println("Are the arrays same? " + equals(list1, list2));

		} catch (InputMismatchException ex) {
			System.out.println("Wrong input");
		}
	}

	public static boolean equals(int[] niz1, int[] niz2) {
		//Metoda koja provjerava da li su array-i isti
		int differentCounter = 0;
		for (int i = 0; i < niz1.length; i++) {
			if (niz1[i] != niz2[i]) {
				differentCounter++;

			}
		}
		if (differentCounter != 0) {
			return false;
		} else {

			return true;
		}
	}
}
