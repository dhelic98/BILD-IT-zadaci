package zadaci_10_02_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja vraća lokaciju najvećeg elementa u 2D nizu.
		 * Metoda treba da koristi sljedeći header:
		 * 
		 * public static int[ ] locateLargest(double[ ][ ] a)
		 * 
		 * Napisati test program koji pita korisnika da unese 2D niz te mu
		 * ispisuje lokaciju najvećeg elementa u nizu.
		 */

		Scanner uInput = new Scanner(System.in);

		try {
			// Unos od strane korisnika koji odredjuje velicinu 2d niza
			System.out.println("Enter the size of 2d array");
			System.out.println("Enter rows");
			int rows = uInput.nextInt();
			System.out.println("Enter columns");
			int columns = uInput.nextInt();
			// Deklarisanje 2d niza
			double[][] numbers = new double[rows][columns];
			// Unos brojeva u 2d array
			System.out.println("Enter numbers into array");
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 0; j < numbers[i].length; j++) {
					numbers[i][j] = uInput.nextDouble();

				}

			}
			// Pozivanje metode
			int[] position = locateLargest(numbers);
			System.out.println("Largest number "
					+ numbers[position[0]][position[1]] + " is located on ["
					+ position[0] + "][" + position[1] + "]");

		} catch (InputMismatchException ex) {

		}

	}

	public static int[] locateLargest(double[][] a) {
		// Metoda pronalazi koordinate najveceg broja u 2d nizu
		int[] coordinates = new int[2];
		double largest = 0;
		// Prolazimo kroz metodu i pronalazimo najveci broj
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > largest) {
					largest = a[i][j];
					coordinates[0] = i;
					coordinates[1] = j;

				}

			}

		}

		return coordinates;

	}

}
