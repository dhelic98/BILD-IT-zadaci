package zadaci_08_02_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Napisati sljedeću metodu koja vraća najveću vrijednosti u ArrayListu
		 * Integera. Metoda vraća null ukoliko je lista null iil ukoliko lista
		 * sadrži 0 elemenata.
		 */

		Scanner uInput = new Scanner(System.in);
		ArrayList<Integer> listOfNumbers = new ArrayList<>();
		// Unos brojeva od strane korisnika u listu
		System.out.println("Unesite brojeve u listu");
		int numberInput = uInput.nextInt();
		while (numberInput != 0) {
			listOfNumbers.add(numberInput);
			numberInput = uInput.nextInt();
		}
		// Pozivanje metode koja vraca najveci broj
		if (max(listOfNumbers) == null) {
			System.out.println("Lista je prazna ili je jednaka null-u");
		} else {
			int maxNumber = max(listOfNumbers);
			System.out.println("Najveci broj u listi je " + maxNumber);

		}

	}

	public static Integer max(ArrayList<Integer> list) {
		// Metoda koja pronalazi i vraca najveci broj integer tipa u arraylisti
		Collections.sort(list);
		Collections.reverse(list);
		if (list.isEmpty() == true) {
			return null;
		} else if (list.equals(null)) {
			return null;
		} else {

			return list.get(0);
		}
	}

}
