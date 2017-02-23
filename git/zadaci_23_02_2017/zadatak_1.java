package zadaci_23_02_2017;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji pita korisnika da unese cijeli trocifreni
		 * broj te provjerava da li je unijeti broj palindrom. Broj je palindrom
		 * ukoliko se čita isto i sa lijeva na desno i sa desna na lijevo npr.
		 * 121, 131, itd.
		 */

		Scanner uInpunt = new Scanner(System.in);
		while (true) {
			int number = methods.User_Input.positiveIntInput(uInpunt,
					"Enter 3-digit number");

			if ((number < 100) || (number > 999)) {
				System.out.println("Number must be 3 digit");
				continue;
			}

			if (isPalindrome(number)) {
				System.out.println("Number " + number + " is palindrome");

			} else {
				System.out.println("Number " + number + " is not palindrome");
			}

			break;
		}
		uInpunt.close();
	}

	public static int getReverse(int number) {
		// method that checks if numbers are palindrome
		String reverseNum = "";
		while (number > 0) {
			reverseNum += number % 10;
			number /= 10;
		}

		return Integer.parseInt(reverseNum);
	}

	public static boolean isPalindrome(int number) {
		// method that checks if numbers are palindrome
		if (number != getReverse(number)) {
			return false;
		}

		return true;
	}

}
