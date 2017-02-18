package zadaci_17_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji pita korisnika da unese dva stringa te
		 * provjerava i ispisuje da li je drugi string substring prvog stringa.
		 * Na primjer, ukoliko korisnik unese ABCD kao prvi string a BC kao
		 * drugi string program mu ispisuje da je BC substring ABCD stringa.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Input by user
				System.out.println("Please input string");
				String firstString = uInput.nextLine();
				while ((firstString == "") || (firstString == " ")) {
					System.out.println("Enter string please");
					firstString = uInput.nextLine();
				}
				// Input by user
				System.out.println("Please input second string");
				String secondString = uInput.nextLine();
				while ((secondString == "") || (secondString == " ")) {
					System.out.println("Enter string please");
					secondString = uInput.nextLine();
				}
				// Condition to check if second string is substring of first
				if (firstString.contains(secondString)) {
					System.out.println("Second string is substring of first");
					break;
				} else {
					System.out
							.println("Second string is not substring of first string");
					break;

				}

			} catch (InputMismatchException ex) {

				System.out.println("There was an input exception");
				uInput.nextLine();
			} catch (Exception e) {
				System.out.println("There was an exception");
				uInput.nextLine();
			}

		} while (true);
		// Closing scanner
		uInput.close();

	}

}
