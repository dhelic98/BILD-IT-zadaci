package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User_Input {

	public static int positiveIntInput(Scanner uInput, String text) {
		// Method that inputs 1 positive integer
		int number = 0;
		do {
			try {
				System.out.println(text);
				number = uInput.nextInt();
				while (number <= 0) {
					System.out.println("Input must be positive");
					number = uInput.nextInt();
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Input exception");
				uInput.nextLine();
			}
		} while (true);

		return number;

	}

	public static double positiveDoubleInput(Scanner uInput, String text) {
		//Method that inputs 1 positive double
		double number = 0;
		do {
			try {
				System.out.println(text);
				number = uInput.nextDouble();
				while (number <= 0) {
					System.out.println("Input must be positive");
					number = uInput.nextDouble();
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Input exception");
				uInput.nextLine();
			}
		} while (true);

		return number;

	}

}
