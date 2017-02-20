package zadaci_20_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji pita korisnika da unese dva cijela,
		 * pozitivna broja te ispisuje najveći i najmanji zajednički djelilac za
		 * ta dva broja.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// first number input
				System.out.println("Input positive number");
				int number1 = uInput.nextInt();
				while (number1 <= 0) {
					System.out.println("Number must be positive.Input again");
					number1 = uInput.nextInt();
				}
				// second number input
				System.out.println("Input second number:");
				int number2 = uInput.nextInt();
				while (number2 <= 0) {
					System.out.println("Number must be positive.Input again");
					number2 = uInput.nextInt();
				}
				//calling method
				int nzd = largestDivisor(number1, number2);
				//Printing out the result
				System.out.println("Greatest common divisor for numbers "
						+ number1 + " and " + number2 + " is " + nzd
						+ " and lowest common divisor is "
						+ lowestCommonDivisor(number1, number2));
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();

			} catch (Exception e) {
				System.out.println("Exception");
				uInput.nextLine();

			}

		} while (true);
		uInput.close();
	}

	public static int largestDivisor(int n1, int n2) {
		//Method that finds largest common divisor
		int nzd = 0;
		for (int i = Math.min(n1, n2); i > 0; i--) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				nzd = i;
				break;

			}
		}
		return nzd;
	}

	public static int lowestCommonDivisor(int n1, int n2) {

		for (int i = 2; i <= (Math.min(n1, n2)); i++) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				return i;
			}
		}

		return 1;
	}

}
