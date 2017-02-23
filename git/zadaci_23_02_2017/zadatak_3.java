package zadaci_23_02_2017;

import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji pita korisnika da unese Social Security
		 * Number (SSN) u formatu DDD-DD-DDDD gdje D predstavlja broj. Program
		 * treba da provjerava da li je broj unesešen u ispravnom formatu.
		 * Ukoliko nije, program pita korisnika da pokuša ponovo. Ukoliko jeste
		 * unešen u pravom formatu, program završava sa radom.
		 */

		Scanner uInput = new Scanner(System.in);
		while (true) {
			//Input by user
			System.out
					.println("Please enter your SSN in (DDD-DD-DDDD) format where D is digit");
			String input = uInput.nextLine();

			//Calling method and checking if number is valid
			if (isValid(input)) {
				System.out.println("Your SSN is valid");

			} else {
				System.out.println("Your SSN is not valid");
			}
			break;

		}

		uInput.close();
	}

	public static boolean isValid(String input) {
		//method that checks if SSN is valid
		if (input.length() != 11) {
			return false;
		}
		if ((input.charAt(3) != '-') || (input.charAt(6) != '-')) {
			return false;

		}
		for (int i = 0; i < input.length(); i++) {
			if ((i == 3) || (i == 6)) {
				continue;
			}
			if ((!Character.isDigit(input.charAt(i)))) {
				return false;
			}
		}

		return true;
	}
}
