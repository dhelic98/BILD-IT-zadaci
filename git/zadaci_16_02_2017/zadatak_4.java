package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napišite program koji učitava neodređen broj cijelih brojeva (unos
		 * prekida nula), pronalazi najveći od unijetih brojeva te ispisuje
		 * koliko se najveći broj puta ponovio. Na primjer, ukoliko unesemo 3 5
		 * 2 5 5 5 0 program ispisuje da je najveći broj 5 te ispisuje da se
		 * isti ponavlja 4 puta.
		 */

		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Please enter number, 0 stops input");
				// Input by user
				int number = uInput.nextInt();
				// Variables that represent largest number and number of largest
				// number repetitions
				int max = 1;
				int maxCount = number;

				// Loop as condition for input
				while (number != 0) {
					System.out.println("Enter number again.Enter 0 to stop");
					number = uInput.nextInt();
					if (max < number) {
						max = number;
						maxCount = 1;
					} else if (max == number) {
						maxCount++;
					}
				}
				// printing out the result
				System.out.println("Largest number is " + max
						+ " and it has been repeated " + maxCount + " times");
				break;

			} catch (InputMismatchException ex) {
				System.out.println("There was an input exception");
				uInput.nextLine();
			}

		} while (true);
		uInput.close();

	}

}
