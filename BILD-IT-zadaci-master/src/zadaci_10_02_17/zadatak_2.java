package zadaci_10_02_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja nalazi najmanji element u nizu decimalnih
		 * vrijednosti koristeći se sljedećim headerom:
		 * 
		 * public static double min(double[ ] array)
		 * 
		 * Napišite potom test program koji pita korisnika da unese deset
		 * brojeva te poziva ovu metodu da vrati najmanji element u nizu.
		 */

		// Deklarisemo array koji sadrzi brojeve double tipa
		Scanner uInput = new Scanner(System.in);
		double[] numbers = new double[10];
		try {
			// Prolaz kroz petlju i unos brojeva u petlju
			for (int i = 0; i < numbers.length; i++) {
				System.out.println("Enter double type number");
				numbers[i] = uInput.nextDouble();

			}
			// Pozivanje metode
			double minNumber = min(numbers);
			System.out.println("Lowest number in your input is " + minNumber);

		} catch (Exception ex) {
			System.out.println("Input error");

		}

	}

	public static double min(double[] array) {
		// Metoda koja vraca najmanji broj u array-u
		ArrayList<Double> list = new ArrayList<>();
		double minNumber = Integer.MAX_VALUE;

		// Prebacivanje sadrzaja iz array-a u arrayList radi lakseg sortiranja
		for (int i = 0; i < array.length; i++) {
			list.add(array[i]);

		}
		// Sortiarnje
		Collections.sort(list);

		minNumber = list.get(0);
		// Vracamo najmanji broj
		return minNumber;
	}

}
