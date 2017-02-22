package zadaci_22_02_2017;

import java.util.Random;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji nasumično generiše cijeli broj između 1 i 12
		 * te ispisuje ime mjeseca za taj broj. (Januar za 1, Ferbruar za 2....)
		 */

		// Generating random number
		Random random = new Random();
		int month = random.nextInt(11) + 1;

		// Initializing array with months
		String[] months = { "Januar", "Februar", "Mart", "April", "Maj",
				"Juni", "Juli", "August", "Septembar", "Oktobar", "Novembar",
				"Decembar" };
		// Printing out the result
		System.out.println("Mjesec za " + (month + 1) + " is " + months[month]);

	}

}
