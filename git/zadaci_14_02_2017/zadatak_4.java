package zadaci_14_02_2017;

import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji pita korisnika da unese neki string te mu
		 * ispisuje sve karaktere koji se nalaze na neparnim pozicijama. Na
		 * primjer, ako korisnik unese string Beijing Chicago, program vraća
		 * BiigCiao.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				//Unos od strane korisnika
				System.out.println("Please input a line");
				String line = uInput.nextLine();
				// Pozivanje metode
				printOddIndex(line);
				break;

			} catch (Exception ex) {
				System.out.println("There was an exception");
				uInput.nextLine();
			}

		} while (true);
		// zatvaramo unos
		uInput.close();

	}

	public static void printOddIndex(String line) {
		// Metoda koja printa karaktere na neparnim mjestima
		for (int i = 0; i < line.length(); i++) {
			if (i == 0) {
				System.out.print(line.charAt(i));
			} else if (i % 2 == 0) {
				System.out.print(line.charAt(i));
			}
		}

	}
}
