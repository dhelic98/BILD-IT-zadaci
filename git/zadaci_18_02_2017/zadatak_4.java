package zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji pita korisnika da unese broj minuta (npr. 1
		 * milijardu) te ispiše korisniku koliko je to u godinama i danima. Zbog
		 * jednostavnosti, pretpostavimo da godina ima 365 dana.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				//user input
				System.out
						.println("Please enter how many minutes you want to convert");
				long minutes = uInput.nextLong();
				while (minutes <= 0) {
					System.out
							.println("Please enter positive number of minutes");
					minutes = uInput.nextLong();
				}
				//calling the method
				daysAndYears(minutes);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("There was an input exception");
				uInput.nextLine();
			} catch (Exception e) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);
		//closing scanner
		uInput.close();
	}

	public static void daysAndYears(long minutes) {
		//Method that converts minutes into days and years and prints out
		long hours = minutes / 60;
		long days = hours / 24;
		long years = days / 365;
		System.out.println(minutes + " minutes are equal to " + days
				+ " days or " + years + " years");
	}

}
