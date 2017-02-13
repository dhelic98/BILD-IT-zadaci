package zadaci_09_02_17;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja prima jedan argument te simulira bacanje novčića
		 * toliko puta. Nakon što se simulacija završi, program ispisuje koliko
		 * puta je novčić pokazao glavu a koliko puta pismo.
		 */
		// Ucitavanje scanner-a
		Scanner uInput = new Scanner(System.in);
		try {
			// Unos od strane korisnika
			System.out.println("Unesite broj bacanja koje zelite");
			int number = uInput.nextInt();

			// Pozivanje metode
			coinTossSimulation(number);

		} catch (Exception ex) {
			// Exception u slucaju da korisnik unese karakter koji nije broj
			System.out.println("Unijeli ste karakter koji nije broj");
		}
	}

	public static void coinTossSimulation(int n) {
		// Brojac glave i brojac pisma
		int headCount = 0, tailCount = 0;
		// Petlja koja simulise bacanja
		for (int i = 0; i < n; i++) {

			// Generisemo random broj 0(za glavu) ili 1(za pismo)
			int toss = (int) (Math.random() * 2);

			if (toss == 0) {
				headCount++;
			}

			else if (toss == 1) {
				tailCount++;
			}

		}
		// Printamo stanje poslije simulacije bacanja novcica
		System.out.println("Novcic je bacen: " + n + " puta");
		System.out.println("Pismo je bilo " + tailCount + " puta");
		System.out.println("Glava je bila " + headCount + " puta");

	}

}
