package zadaci_21_02_2017;

import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napišite metodu sa sljedećim headerom koja vraća naopako ispisan
		 * broj koji joj je proslijeđen kao argument: public static void
		 * reverse(int number). Na primjer, reverse(3456) treba da vrati 6543.
		 * Napisati program koji pita korisnika da unese neki cijeli broj te mu
		 * vrati isti ispisan naopako.
		 */
		// Scanner input
		Scanner uInput = new Scanner(System.in);
		// calling method that inputs number
		int number = methods.User_Input.positiveIntInput(uInput,
				"Please enter positive number");
		// calling method that prints out number in reverse
		reverse(number);
		// closing scanner
		uInput.close();

	}

	public static void reverse(int number) {
		// Method that returns number in reverse
		String sNumber = number + "";
		System.out.print("Your number in reverse is: ");
		for (int i = sNumber.length() - 1; i >= 0; i--) {
			System.out.print(sNumber.charAt(i));

		}
	}

}
