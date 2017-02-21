package zadaci_21_02_2017;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. (Izračunavanje napojnice) Napisati program koji učitava ukupan
		 * iznos računa koji treba uplatiti kao i procenat tog računa kojeg
		 * želimo platiti kao napojnicu te izračunava ukupan račun i napojnicu.
		 * Na primjer, ukoliko korisnik unese 10 kao račun i 15 % kao procenat
		 * za napojnicu program treba da ispiše da je ukupan račun za uplatiti
		 * 11.5 a napojnica 1.5.
		 */

		// Scanner
		Scanner uInput = new Scanner(System.in);
		// Calling methods for type double input
		double check = methods.User_Input.positiveDoubleInput(uInput,
				"Enter ammount to pay on check:");
		double tip = methods.User_Input.positiveDoubleInput(uInput,
				"Enter percentage of tip");
		// Counting tip and total ammount
		double totalTip = ((check) * (tip / 100));
		double total = ((check) * (1 + (tip / 100)));
		// Printing out the result
		System.out.print("Check is: $");
		System.out.printf("%10.2f", check);
		System.out.print("\nTip percentage: ");
		System.out.printf("%4.0f", tip);
		System.out.print("%\n");
		System.out.print("Tip is: $");
		System.out.printf("%12.2f", totalTip);
		System.out.print("\nTotal is: $");
		System.out.printf("%10.2f", total);

		uInput.close();

	}

}
