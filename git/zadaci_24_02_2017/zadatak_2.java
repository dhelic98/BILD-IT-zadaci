package zadaci_24_02_2017;

import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji prima karakter te vraća njegov Unicode.
		 * Primjer: ukoliko korisnik unese karakter E program mu vraća 69 kao
		 * unicode za taj karakter.
		 */

		Scanner uInput = new Scanner(System.in);

		while (true) {
			//Input by user
			System.out.println("Enter character please");
			//COnverting
			char input = uInput.nextLine().charAt(0);
			int convert = (int) input;
			//printing out the result
			System.out.println("Your character \'" + input
					+ "\' is unicode of " + convert);
			break;
		}
	}

}
