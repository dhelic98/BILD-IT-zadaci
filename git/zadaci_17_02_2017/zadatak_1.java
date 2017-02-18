package zadaci_17_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati metodu koja vraća broj dana u godini. Metoda koristi
		 * sljedeći header: public static int numberOfDayInAYear(int year).
		 * Napisati program koji pita korisnika da unese početnu godinu, krajnju
		 * godinu te ispisuje broj dana za svaku godinu u rasponu.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				System.out.println("Enter starting year");
				// user input
				int startingYear = uInput.nextInt();
				// input must be positive
				while (startingYear < 0) {
					System.out.println("Input must be positive");
					startingYear = uInput.nextInt();
				}
				System.out.println("Enter ending year");
				// user input
				int endingYear = uInput.nextInt();
				while (endingYear < 0) {
					System.out.println("Input must be positive");
					endingYear = uInput.nextInt();

				}

				// loop that calls the method and prints out the result
				for (int i = startingYear; i <= endingYear; i++) {
					System.out.println("The year " + i + " has "
							+ numberOfDayInAYear(i) + " days.");
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("There was an input exception");
				uInput.nextLine();

			} catch (Exception e) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);

		uInput.close();

	}

	public static int numberOfDayInAYear(int year) {
		// Method that returns number of days in a year
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			return 366;
		} else {
			return 365;
		}
	}

}
