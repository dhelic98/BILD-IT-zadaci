package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji pita korisnika da unese mjesec i godinu te
		 * mu ispiše broj dana u datom mjesecu. Na primjer, ukoliko korisnik
		 * unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je
		 * Februar 2012 imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a
		 * kao mjesec 3, program treba ispisati da je Mart 2015 imao 31 dan.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Input by user
				System.out.println("Please enter the year");
				int year = uInput.nextInt();
				System.out.println("Please enter the month 1-12");
				int month = uInput.nextInt();

				// Loop as condition for month input
				while ((month <= 0) || (month > 12)) {
					System.out
							.println("Your month input is wrong please try again");
					month = uInput.nextInt();
				}
				// Calling method that will find number of days in month
				int numberOfDaysInMonth = numberOfDaysInMonth(month, year);
				// Printing out the result
				System.out.println("Number of days in " + month + " of " + year
						+ " is " + numberOfDaysInMonth);
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Your input is wrong");
			}

		} while (true);

		// Closing of scanner
		uInput.close();

	}

	public static int numberOfDaysInMonth(int month, int year) {
		// Method that returns number of days in given month
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7)
				|| (month == 8) || (month == 10) || (month == 12)) {
			return 31;
		} else if (month == 2) {
			// Mathod call that checks if year is leap
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else if ((month == 4) || (month == 6) || (month == 9) || (month == 1)) {
			return 30;
		} else {
			return 0;
		}

	}

	public static boolean isLeapYear(int year) {
		// Method that checks whether the year is leap
		if (((year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0))) {
			return true;

		}
		return false;

	}

}
