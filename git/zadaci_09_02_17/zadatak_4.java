package zadaci_09_02_17;

import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja ispisuje n x n matricu korsiteći sljedeći
		 * header: public static void printMatrix(int n) Svaki element u matrici
		 * je ili 0 ili 1, generisan nasumično. Napisati test program koji pita
		 * korisnika da unese n te ispisuje n x n matricu.
		 */

		// Ucitavanje scanner-a
		Scanner uInput = new Scanner(System.in);
		try {
			// Unos od strane korisnika
			System.out.println("Unesite broj");
			int number = uInput.nextInt();

			// Pozivanje metode
			printMatrix(number);

		} catch (Exception ex) {
			// Exception u slucaju da korisnik unese karakter koji nije broj
			System.out.println("Unijeli ste karakter koji nije broj");
		}

	}

	public static void printMatrix(int n) {

		// Deklarisanje 2d niza
		int[][] matrix = new int[n][n];

		// Prolazimo petljom kroz niz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// generisemo random int 0 ili 1
				matrix[i][j] = (int) (Math.random()*2);

				// Ispisivanje
				System.out.print(matrix[i][j] + " ");

			}
			// Prelazimo u novi red
			System.out.println();

		}

	}
}
