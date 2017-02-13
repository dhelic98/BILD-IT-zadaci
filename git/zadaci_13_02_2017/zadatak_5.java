package zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja broji slova u stringu. Metoda treba koristiti
		 * sljedeći header: public static int countLetters(String s). Napisati
		 * program koji pita korisnika da unese neki string te mu vrati koliko
		 * taj string ima slova.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Unos recenice od strane korisnika
				System.out.println("Please input a sentence");
				String lineInput = uInput.nextLine();
				// Pozivanje metode
				int numberOfLettersInLine = countLetters(lineInput);
				// Printanje rezultata korisniku
				System.out.println("Your line has " + numberOfLettersInLine
						+ " letters");
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Your Input is wrong");
			} catch (Exception ex) {
				System.out.println("There is and exception in the programm");
			}

		} while (true);

	}

	public static int countLetters(String s) {
		// Metoda koja prolazi kroz petlju i prebrojava slova u proslijedjenom
		// Stringu
		int numOfletters = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isLetter(c)) {
				numOfletters++;
			}
		}
		// Vracamo broj slova
		return numOfletters;
	}

}
