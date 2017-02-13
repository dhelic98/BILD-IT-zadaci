package zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji pita korisnika da unese 2 stringa te
		 * ispisuje najveći zajednički prefix za ta dva stringa, ukoliko isti
		 * postoji. Na primjer, ukoliko korisnik unese sljedeća dva stringa
		 * "Dobrodošli u Dubai" i "Dobrodošli u Vankuver" program treba da
		 * ispiše: Najveći zajednički prefix za dva stringa je "Dobrodošli u".
		 */
		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Unos od strane korisnika
				System.out.println("Enter 1st strings");
				String firstString = uInput.nextLine();
				System.out.println("Enter 2nd string");
				String secondString = uInput.nextLine();
				// Izracvnavamo kraci niz
				int smallerStringSize = Math.min(firstString.length(),
						secondString.length());
				String smallerString = "";
				// Manji od 2 unesena stringa dodjeljujemo varijabli
				// smallerString
				if (firstString.length() == smallerStringSize) {
					smallerString = firstString;
				} else {
					smallerString = secondString;
				}
				// Deklarisanje varijable index koja nam sluzi da izvucemo
				// prefix
				int index = 1;
				// Petljom prolazimo kroz manji string i provjeravamo da li su
				// slova ista
				for (int i = 0; i < smallerString.length(); i++) {

					if (firstString.charAt(i) != secondString.charAt(i)) {
						index = i;
						break;

					} else {
						index = smallerString.length();
					}
				}
				// Slucaj ako je prefix 0
				if (index == 0) {
					System.out.println("Your inputs have no prefix");
				}

				// Printanje stanja tj rezultata
				System.out.println("Prefix in your 2 strings is: "
						+ smallerString.substring(0, index));
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Your input is wong");
			}

		} while (true);

	}
}
