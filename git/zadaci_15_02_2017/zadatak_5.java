package zadaci_15_02_2017;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Neke web stranice forsiraju određena pravila za passworde.
		 * Napisati metodu koja provjerava da li je unijeti string validan
		 * password. Pravila da bi password bio validan su sljedeća: 1. Password
		 * mora biti sačinjen od najmanje 8 karaktera. 2. Password smije da se
		 * sastoji samo od slova i brojeva. 3. Password mora sadržati najmanje 2
		 * broja. Napisati program koji pita korisnika da unese password te mu
		 * ispisuje "password je validan" ukoliko su sva pravila ispoštovana ili
		 * "password nije validan" ukoliko pravila nisu ispoštovana.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Input by user
				System.out.println("Please enter password that is:");
				System.out
						.println("1.8 characters long\n2.It can only contain letters and digits\n3.It MUST contain at least 2 digits");
				String password = uInput.nextLine();

				// Condition that checks if password is valid
				if ((isLongEnough(password) == true)
						&& (doesContainSpecialChar(password) == true)
						&& (doesContainEnoughtDigits(password))) {
					System.out.println("Your password is valid");

				} else {
					System.out.println("Your password is not valid");
				}

			} catch (Exception ex) {
				System.out.println("There was an exception");
			}

		} while (true);

	}

	public static boolean isLongEnough(String password) {
		// Method that checks the lenght of password
		if (password.length() < 8) {
			return false;
		} else
			return true;
	}

	public static boolean doesContainSpecialChar(String password) {
		// method that checks whether string contains special characters
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if ((Character.isDigit(c) != true)
					&& (Character.isLetter(c) != true)) {
				return false;

			}
		}
		return true;
	}

	public static boolean doesContainEnoughtDigits(String password) {
		// method that check if password contains
		int digitCounter = 0;
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isDigit(c)) {
				digitCounter++;
			}
		}
		if (digitCounter >= 2) {
			return true;
		} else {
			return false;
		}
	}

}
