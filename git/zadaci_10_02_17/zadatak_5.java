package zadaci_10_02_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Implementirati sljedeću metodu da sortira redove u 2D nizu.
		 * 
		 * public static double[ ][ ] sortRows(double[ ][ ] array)
		 * 
		 * Napisati testni program koji pita korisnika da unese 3x3 matricu (ili
		 * da pita korisnika koliku matricu želi unijeti) te mu ispisuje na
		 * konzoli matricu sa sortiranim redovima - od najmanjeg broja do
		 * najvećeg.
		 */

		Scanner uInput = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = uInput.nextInt();
		// Deklarisanje array-a
		double[][] numbers = new double[size][size];
		// Unos od strane korisnika
		System.out.println("Enter numbers into array");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println("Enter number");
				numbers[i][j] = uInput.nextDouble();

			}

		}

		// Pozivanje metode
		double[][] sorted = sortRows(numbers);
		// Printanje array-a
		for (int i = 0; i < sorted.length; i++) {
			for (int j = 0; j < sorted[i].length; j++) {
				System.out.print(sorted[i][j] + " ");

			}
			System.out.println();

		}

	}

	public static double[][] sortRows(double[][] array) {
		// Metoda koja sortira redove i vraca 2d array
		// Koristimo arrayList radi lakseg soritranja

		ArrayList<Double> listForSorting = new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				listForSorting.add(array[i][j]);

			}
			// Pozivamo sort iz Kolekcija
			Collections.sort(listForSorting);
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = listForSorting.get(j);

			}
			// Cistimo listu
			listForSorting.clear();

		}

		return array;
	}

}
