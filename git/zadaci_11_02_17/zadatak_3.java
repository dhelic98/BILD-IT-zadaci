package zadaci_11_02_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu sa sljedećim headerom koja ispisuje tri broja u
		 * rastućem redosljedu: public static void displaySortedNumbers(double
		 * num1, double num2, double num3). Napisati program koji pita korisnika
		 * da unese tri broja te ispiše ta tri broja u rastućem redosljedu.
		 */

		Scanner uInput = new Scanner(System.in);
		boolean isPrinted = false;
		do {
			try {
				// Unos od strane korisnika
				System.out.println("Enter 3 numbers");
				System.out.println("Number 1: ");
				double number1 = uInput.nextDouble();
				System.out.println("Number 2: ");
				double number2 = uInput.nextDouble();
				System.out.println("Number 3: ");
				double number3 = uInput.nextDouble();

				// Pozivanje metode
				displaySortedNumbers(number1, number2, number3);
				isPrinted = true;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			}
		} while (!isPrinted);

	}

	public static void displaySortedNumbers(double num1, double num2,
			double num3) {
		// Metoda koja pronalazi printa brojeve u rastucem redoslijedu

		// Deklaracija arrayListe pomocu koje sortiramo brojeve u rastucem
		// slijedu
		ArrayList<Double> numbers = new ArrayList<>();
		// Ubacujemo brojeve u arrayList
		numbers.add(num1);
		numbers.add(num2);
		numbers.add(num3);

		Collections.sort(numbers);
		// Printanje brojeva
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " | ");

		}

	}

}
