package zadaci_13_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji prima 10 cijelih brojeva te ih ispisuje u
		 * obrnutom redosljedu.
		 */
		do {
			Scanner uInput = new Scanner(System.in);
			// Deklarisemo arrayList-u u koju cemo unositi brojeve
			ArrayList<Integer> numbers = new ArrayList<>();

			try {
				// Unos brojeva od strane korisnika
				for (int i = 0; i < 10; i++) {
					System.out.println("Enter your number");
					int userInput = uInput.nextInt();
					// Dodajemo unos u arrayList
					numbers.add(userInput);

				}
				// Sortiranje liste
				Collections.reverse(numbers);
				// Pritanje liste u nazad
				System.out.print("Your numbers in reverse: ");
				for (int i = 0; i < numbers.size(); i++) {
					System.out.print(numbers.get(i) + " ");

				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Your Input is wrong");
			}

		} while (true);

	}
}
