package zadaci_14_02_2017;

import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Napisati metode sa sljedećim headerima: public static int
		 * reverse(int number) i public static boolean isPalindrome(int number).
		 * Prva metoda prima cijeli broj kao argument i vraća isti ispisan
		 * naopako. (npr. reverse(456) vraća 654.) Druga metoda vraća true
		 * ukoliko je broj palindrom a false ukoliko nije. Koristite reverse
		 * metodu da implementirate isPalindrome metodu. Napišite program koji
		 * pita korisnika da unese broj te mu vrati da li je broj palindrome ili
		 * ne.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Unos od strane korisnika
				System.out.println("Please enter the number");
				int number = uInput.nextInt();
				// Uslov za unos
				while (number <= 0) {
					System.out.println("Your input must be higher than 0");
					System.out.println("Please input again");
					number = uInput.nextInt();
				}
				// Pozivanje metode
				int reverseNumber = reverse(number);

				// Ispis za korisnika
				System.out.println("Revers number of your input is "
						+ reverseNumber);
				System.out.println("Is input number a palindrome? "
						+ isPalindrome(number));

				break;
			} catch (Exception ex) {
				System.out.println("There was an exception");
				uInput.nextLine();
			}

		} while (true);
		// Zatvaramo unos
		uInput.close();

	}

	public static int reverse(int number) {
		// Metoda koja pronalazi i vraca uneseni broj obrnuto
		String reverse = "";
		int reverseNumber = 0;
		while (number >= 1) {
			reverse += number % 10;
			number /= 10;
		}
		reverseNumber = Integer.parseInt(reverse);
		return reverseNumber;
	}

	public static boolean isPalindrome(int number) {
		// Metoda koja provjerava da li je broj palindrom
		int reverseNumber = reverse(number);
		if (reverseNumber == number) {
			return true;
		} else {
			return false;
		}
	}

}
