package zadaci_11_02_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji pita korisnika da unese neki cijeli broj te
		 * ispisuje njegove najmanje faktore u rastućem redosljedu. Na primjer,
		 * ukoliko korisnik unese 120 program treba da ispiše 2, 2, 2, 3, 5. (2
		 * * 2 * 2 * 3 * 5 = 120)
		 */

		Scanner uInput = new Scanner(System.in);
		do {
			try {
				// Unos od strane korisnika
				System.out.println("Enter whole number");
				int number = uInput.nextInt();
				// Unos mora da bude pozitivan integer
				while (number <= 0) {
					System.out.println("Enter positive number ");
					number = uInput.nextInt();
				}
				if (number == 1) {
					System.out.println("Faktori broja 1 su:1");
					break;
				} else {
					// Deklarisanje arrayListe i pozivanje metode
					ArrayList<Integer> listOfFactors = faktoriBroja(number);

					// Printanje arrayListe
					System.out.print("Factors of " + number + " are:");
					for (int i = 0; i < listOfFactors.size(); i++) {
						System.out.print(listOfFactors.get(i) + " ");

					}

					break;
				}
			} catch (InputMismatchException ex) {
				// Exception
				System.out.println("Input is wrong");

			}
			uInput.nextLine();
		} while (true);

	}

	public static ArrayList<Integer> faktoriBroja(int num) {
		// Metoda koja pronalazi faktore
		ArrayList<Integer> faktori = new ArrayList<>();
		int divisor = 2;
		while (num > 1) {
			// Prolazimo petljom od 2 do broja i pronalazimo prvi broj s kojim
			// je djeljiv te prekidamo petlju
			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					divisor = i;
					faktori.add(divisor);
					break;

				}

			}

			num /= divisor;
		}
		// Sortiranje arrayListe
		Collections.sort(faktori);
		// Vracamo arrayList
		return faktori;

	}

}
