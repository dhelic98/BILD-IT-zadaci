package zadaci_10_02_17;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja prima 2 argumenta: početni broj i krajnji broj
		 * te printa sve proste brojeve u zadanom rangu. BONUS: metoda može
		 * primati i treći argument, broj brojeva za isprintati po liniji.
		 */

		Scanner uInput = new Scanner(System.in);

		try {
			// Unosimo pocetni broj
			System.out.println("Enter start number");
			int startNumber = uInput.nextInt();

			// Unosimo krajnji broj
			System.out.println("Enter last number");
			int endNumber = uInput.nextInt();

			// Unosimo broj linija
			System.out.println("Enter number of primes per line");
			int numberPerLine = uInput.nextInt();

			// Pozivamo metodu
			printPrime(startNumber, endNumber, numberPerLine);

		} catch (Exception ex) {
			System.out.println("Wrong input");
		}

	}

	public static void printPrime(int start, int end, int numPerLine) {
		// Metoda koja printa proste brojeve

		// Varijabla koja prati broj printanja

		int printCounter = 0;
		// Petljom prolazimo brojeve izmedju int argumenata
		while (start <= end) {
			boolean isPrime = true;
			// Petljom provjeravamo da li je broj prost
			for (int divisor = 2; divisor <= start / 2; divisor++) {
				if (start % divisor == 0) {
					isPrime = false;
					break;

				}
			}
			// Provjera i printanje prostog broja
			if (isPrime == true) {
				System.out.print(start + " ");
				printCounter++;

				if (printCounter % numPerLine == 0) {
					System.out.println();
				}

			}

			start++;
		}

	}
}
