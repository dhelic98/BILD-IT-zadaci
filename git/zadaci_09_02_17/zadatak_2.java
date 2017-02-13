package zadaci_09_02_17;

import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja prima jedan argument, broj pitanja, te generiše
		 * toliko nasumičnih, jednostavnih pitanja oduzimanja tipa : „Koliko je
		 * 5 - 2 ?“. Metoda treba da broji broj tačnih i netačnih odgovora te ih
		 * ispiše korisniku.
		 */

		int numberOfTasks = 0;
		Scanner uInput = new Scanner(System.in);
		try {
			// Unos od strane korisnika
			System.out.println("Unesite broj zadataka koji zelite");
			numberOfTasks = uInput.nextInt();
			oduzimanje(numberOfTasks);

		} catch (Exception ex) {
			// Exception u slucaju unosa znaka koji nije broj
			System.out.println("Niste unijeli broj pokusajte ponovo");
		}

	}

	public static void oduzimanje(int brojZadataka) {
		/*
		 * Metoda koja prima argumenat i izbacuje zadatke sa oduzimanjem te
		 * koristi brojac za brojanje netacnih odgovora
		 */
		Scanner uInput = new Scanner(System.in);
		int wrongAnswerCounter = 0;
		for (int i = 0; i < brojZadataka; i++) {
			int number1 = (int) (Math.random() * 100);
			int number2 = (int) (Math.random() * 100);

			// Uvodimo temp kako bi zamjenili brojeve da bi rezultat bio veci od
			// 0
			int temp = Math.max(number1, number2);
			number2 = Math.min(number1, number2);
			number1 = temp;
			try {
				System.out.println("Koliko je " + number1 + "-" + number2
						+ " ?");
				int result = number1 - number2;
				int userResultInput = uInput.nextInt();
				// Petlja koja provjerava da li je rezulata tacan te ako nije
				// ponovo izbacuje unos za korisnika
				while (userResultInput != result) {
					System.out
							.println("Unijeli ste pogresan rezultat pokusajte ponovo");
					userResultInput = uInput.nextInt();
					wrongAnswerCounter++;
				}

			} catch (Exception ex) {
				System.out.println("Unijeli ste znak koji nije broj");

			}

		}
		System.out.println();
		System.out.println("Uradili ste " + brojZadataka + " a imali ste "
				+ wrongAnswerCounter + " gresaka");

	}
}
