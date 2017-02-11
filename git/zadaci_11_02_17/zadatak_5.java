package zadaci_11_02_17;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji učitava neodređeni broj cijelih brojeva (nula
		 * prekida unos) te ispisuje koliko je brojeva bilo iznad ili jednako
		 * prosjeku svih unešenih brojeva a koliko je bilo brojeva ispod
		 * prosjeka. Pretpostavimo da je maksimalan niz brojeva koje korisnik
		 * može unijeti 100.
		 */

		Scanner uInput = new Scanner(System.in);
		// Deklarisemo arrayList u koji ubacujemo brojeve od strane korisnika
		ArrayList<Integer> numberList = new ArrayList<>();
		try {
			System.out.println("Unesite cijeli broj");
			int number = uInput.nextInt();
			int sum = number;
			int counter = 0;
			while (number != 0) {
				// Unos brojeva i sabiranje u sumu radi racunanja prosjeka
				System.out.println("Unesite cijeli broj");
				number = uInput.nextInt();
				numberList.add(number);
				sum += number;
				counter++;
				// Provjera da li smo dostigli maksimum od 100 brojeva
				if (counter == 100) {
					System.out.println("Dostigli ste maksimum sa unosom");
					break;
				}

			}
			// Prosjek brojeva
			double average = sum / counter / 1.0;
			// Iznad prosjeka
			int aboveAverage = 0;
			// Ispod prosjeka
			int belowAverage = 0;
			// Jednako
			int equal = 0;
			// Prolazimo kroz petlju i provjeravamo da li su brojevi veci,manji
			// ili jednaki prosjeku
			for (int i = 0; i < numberList.size(); i++) {
				if (numberList.get(i) > average) {
					aboveAverage++;

				} else if (numberList.get(i) < average) {
					belowAverage++;

				} else if (numberList.get(i) == average) {
					equal++;
				}

			}

			// Printamo
			System.out.println("Prosjek unesenih brojeva je: " + average);
			System.out.println("Brojeva iznad prosjeka ima: " + aboveAverage);
			System.out.println("Ispod prosjeka: " + belowAverage);
			System.out.println("Brojevi jednaki prosjeku su: " + equal);

		} catch (InputMismatchException ex) {
			System.out.println("Pogresan unos");

		}
	}
}
