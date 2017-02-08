package zadaci_08_02_17;

import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja prima dva cijela broja kao argumente te vraća
		 * najveći zajednički djelilac za ta dva broja.
		 */

		Scanner uInput = new Scanner(System.in);
		System.out.println("Unesite 2 broja");
		// Unos od strane korisnika
		int broj1 = uInput.nextInt();
		int broj2 = uInput.nextInt();
		//Pozivanje metode
		int nzd = najveciZajednickiDjelilac(broj1, broj2);
		System.out.println("Najveci djelilac za brojeve " + broj1 + " i "
				+ broj2 + " je " + nzd);
	}

	public static Integer najveciZajednickiDjelilac(int broj1, int broj2) {
		// Medota za izracunavanje najveceg zajednickog djelioca
		int najveciDjelilac = 2;
		if (broj1 > broj2) {
			najveciDjelilac = broj1;
		} else if (broj2 > broj1) {
			najveciDjelilac = broj2;
		}
		boolean trigger = false;
		while (trigger != true) {
			if ((broj1 % najveciDjelilac == 0)
					&& (broj2 % najveciDjelilac == 0)) {
				trigger = true;
			} else {
				najveciDjelilac--;
			}

		}
		return najveciDjelilac;

	}
}
