package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji ispisuje tri nasumična cijela broja te pita
		 * korisnika da unese njihov zbir. Ukoliko korisnik pogriješi, program
		 * ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. Ukoliko
		 * korisnik unese tačan odgovor, program mu čestita i završava sa radom.
		 */

		Scanner uInput = new Scanner(System.in);

		// Generating 3 random int numbers
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);
		int number3 = (int) (Math.random() * 100);

		// Declaring result of addition
		int result = number1 + number2 + number3;

		// Printing the task

		do {
			try {
				System.out.println("What is " + number1 + " + " + number2
						+ " + " + number3 + "=?");
				int resultFromUser = uInput.nextInt();

				// Loop as a condition for result
				while (resultFromUser != result) {
					System.out.println("Your input is wrong please try again");
					resultFromUser = uInput.nextInt();
				}
				//If result is correct
				System.out.println("Good job!That is correct");
				break;
			} catch (InputMismatchException ex) {
				System.out.println("There was an exception");
				uInput.nextLine();
			}
		} while (true);
		uInput.close();
	}

}
