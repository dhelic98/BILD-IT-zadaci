package zadaci_18_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji pita korisnika da unese imena tri grada te
		 * ih ispiše u abecednom redu. Na primjer, ukoliko korisnik unese
		 * Chicago, Los Angeles i Atlanta kao gradove, program vraća Atlanta,
		 * Chicago, Los Angeles.
		 */

		// Declarin scanner and arrayList
		Scanner uInput = new Scanner(System.in);

		ArrayList<String> cities = new ArrayList<>();

		do {
			try {
				// User input
				System.out.println("Enter names of 3 cities");
				for (int i = 0; i < 3; i++) {
					System.out.print("Enter city " + (i + 1) + ". ");
					String city = uInput.nextLine();
					cities.add(city);
				}
				// Sorting arrayList with city names
				Collections.sort(cities);
				// Printing out sorted arrayList
				for (int i = 0; i < cities.size(); i++) {
					System.out.println((i + 1) + ". " + cities.get(i));

				}

				break;
			} catch (InputMismatchException ex) {
				System.out.println("There was an input exception");
				uInput.nextLine();
			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);

		uInput.close();

	}

}
