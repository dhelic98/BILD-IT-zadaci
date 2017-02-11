package zadaci_11_02_17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * ISBN-10 (International Standard Book Number) se sadrži od 10 brojeva:
		 * d1 d2 d3 d4 d5 d6 d7 d8 d9 d10. Posljednji broj, d10, služi kao
		 * checksum i njega izračunavamo iz prvih devet brojeva koristeći se
		 * sljedećom formulom: (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6
		 * * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11. Ukoliko je checksum 10, zadnji
		 * broj označavamo sa X u skladu sa ISBN-10 konvencijom. Napisati
		 * program koji pita korisnika da unese prvih 9 brojeva te ispiše
		 * desetocifreni ISBN-10 broj. (Primjer: ukoliko unesemo, kao prvih 9
		 * brojeva, 013601267 program nam ispisuje 0136012671 kao ISBN-10 broj.
		 * Ukoliko unesemo 013031997 kao prvih 9 brojeva, program nam ispisuje
		 * 013031997X kao ISBN-10 broj)
		 */

		Scanner uInput = new Scanner(System.in);
		boolean isPrinted = false;
		do {
			try {
				// Unos od strane korisnika
				// Unosimo kao string
				System.out.println("Enter 9 digit positive number");
				String number9dig = uInput.next();
				// Uslov za broj koji mora imati 9 znamenki
				if (number9dig.length() == 9) {
					boolean wrongInput = false;
					// Provjeravamo da li su svi karakteri brojevi
					for (int i = 0; i < number9dig.length(); i++) {
						char c = number9dig.charAt(i);
						if (Character.isDigit(c)) {
							continue;
						} else {
							wrongInput = true;
						}

					}
					// Ako je unos pogresan izbacujemo poruku
					if (wrongInput == true) {
						System.out.println("Your input is wrong.");
					} else {
						String lastDigitOfISBN = lastDigit(number9dig);
						// Pozivamo metodu
						number9dig += lastDigitOfISBN;
						// Printamo ISBN broj
						System.out.println("Your ISBN is " + number9dig);
						isPrinted = true;
					}

				} else {
					//
					System.out.println("Number is not 9 digits.");

					continue;
				}

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
			}
		} while (isPrinted != true);

	}

	public static String lastDigit(String s) {
		// Metoda koja pronalazi 10-u znamenku
		String lastDigitx = "";
		int sum = 0;
		int number = 0;
		// Prolazimo kroz petlju i racunamo sumu koja nam sluzi za izracunavanje
		// 10-e znamenke
		for (int i = 0; i < s.length(); i++) {
			String temp = s.charAt(i) + "";
			number = Integer.parseInt(temp);
			sum = sum + (number * (i + 1));

		}
		sum = sum % 11;
		if (sum == 10) {
			return "X";
		}
		lastDigitx = sum + "";
		return lastDigitx;

	}

}
