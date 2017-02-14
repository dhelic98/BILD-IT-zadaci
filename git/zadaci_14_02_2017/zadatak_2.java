package zadaci_14_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji ispisuje sve prijestupne godine, 10 po
		 * liniji, u rasponu godina koje korisnik unese. Program pita korisnika
		 * da unese početnu godinu, krajnju godinu te ispisuje sve godine u tom
		 * rasponu. Razmak između godina treba biti jedan space.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Deklarisanje varijabli pocetne i zavrsne godine te
				// inicijalizacija
				int startYear = -1;
				int endYear = -1;
				// Provjeravamo da li su unesene godine pozitivan broj
				while ((startYear <= 0) || (endYear <= 0)) {
					System.out.println("Enter starting year");
					startYear = uInput.nextInt();
					System.out.println("Enter ending year");
					endYear = uInput.nextInt();
					if ((startYear <= 0) || (endYear <= 0)) {
						System.out
								.println("Your input must be positive whole number that represents year");
					}

				}
				// Pozivanje metode
				printYears(startYear, endYear);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Your input is wrong");
				uInput.nextLine();
			}

			catch (Exception ex) {
				System.out.println("There was an exception");
				uInput.nextLine();
			}

		} while (true);
		//Zatvaramo skaner
		uInput.close();
	}

	public static void printYears(int start, int end) {
		// Metoda koja provjerava i printa godine koje su prijestupne
		int printCounter = 0;
		for (int i = start; i <= end; i++) {
			if ((i % 4 == 0) || (i % 400 == 0)) {
				System.out.print(i + " ");
				printCounter++;
				// Uslov za prelazak u novu liniju
				if (printCounter % 10 == 0) {
					System.out.println();
				}

			}
		}
	}

}
