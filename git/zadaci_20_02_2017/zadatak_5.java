package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji učitava cijele brojeve u rasponu od 1 do 100
		 * te broji i ispisuje koliko je koji broj puta unijet. Pretpostavimo da
		 * nula prekida unos brojeva. Ukoliko unesemo sljedeći niz brojeva 2 5 6
		 * 23 42 58 2 6 0 program nam ispisuje da se broj 2 ponavlja 2 puta,
		 * broj 5 jednom, broj 6 2 puta, broj 23 jednom, itd.
		 */

		Scanner uInput = new Scanner(System.in);

		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		int[] repeated = new int[100];

		do {
			try {
				int number = -1;
				while (true) {
					// User input
					System.out
							.println("Enter number between 1 and 100. (0) stops input");
					number = uInput.nextInt();
					if (number == 0) {
						break;
					}
					while ((number < 0) || (number > 100)) {
						System.out.println("Input must be between 1 and 100");
						number = uInput.nextInt();
					}
					// Adding input to arrayList
					listOfNumbers.add(number);
				}

				// Sorting arrayList
				Collections.sort(listOfNumbers);

				// loop that counts numbers repeated
				for (int i = 0; i < listOfNumbers.size(); i++) {
					repeated[listOfNumbers.get(i)]++;
				}
				// Printing out the result
				for (int i = 0; i < repeated.length; i++) {
					if (repeated[i] == 0) {
						continue;
					} else {
						System.out.println("Number " + i
								+ " has been repeated " + repeated[i]
								+ " times.");
					}
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			}

		} while (true);
		// Closing scanner
		uInput.close();

	}
}
