package zadaci_08_02_17;

import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Pretpostavimo da su slova A, E, I, O i U samoglasnici. (Smjela
		 * pretpostavka, znam) Napisati program koji pita korisnika da unese
		 * string te mu ispište broj samoglasnika i suglasnika u datom stringu.
		 */
		Scanner uInput = new Scanner(System.in);
		// Unos od strane korisnika
		System.out.println("Unesite recenicu");
		String line = uInput.nextLine();
		// Pretvaramo recenicu u velika slova radi lakseg obradjivanja recenice
		String tempLine = line.toUpperCase();
		int vowelCounter = 0;
		// Provjera i raunanje broja samoglasnika
		for (int i = 0; i < tempLine.length(); i++) {
			if ((tempLine.charAt(i) == 'A')) {
				vowelCounter++;

			} else if (tempLine.charAt(i) == 'E') {
				vowelCounter++;
			} else if (tempLine.charAt(i) == 'I') {
				vowelCounter++;
			} else if (tempLine.charAt(i) == 'O') {
				vowelCounter++;
			} else if (tempLine.charAt(i) == 'U') {
				vowelCounter++;
			} else {
				continue;
			}
		}
		// Izbacujemo razmake kako bi izracunali broj suglasnika
		tempLine = tempLine.replace(" ", "");
		int consonantCounter = tempLine.length() - vowelCounter;
		System.out.println("Broj slova u recenici je " + tempLine.length());
		System.out.println("Broj samoglasnika je " + vowelCounter);
		System.out.println("Broj suglasnika je " + consonantCounter);
	}
}
