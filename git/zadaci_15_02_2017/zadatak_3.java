package zadaci_15_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji pita korisnika da unese godinu i prva tri
		 * slova imena mjeseca (prvo slovo uppercase) te mu ispiše broj dana u
		 * tom mjesecu. Na primjer, ukoliko korisnik kao godinu unese 2001 a kao
		 * mjesec Jan program mu ispisuje da Jan 2011 ima 31 dan.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Input by user
				System.out.println("Please enter the first 3 letter of month");
				String month = uInput.next();

				// Loop as condition for month input
				while (month.length() != 3) {
					System.out
							.println("Lenght must be 3 letters.Please input again");
					month = uInput.next();
				}
				System.out.println("Please enter the year");
				int year = uInput.nextInt();
				// transfering string to upperCase
				String upperMonth = month.toUpperCase();
				// Calling method that will find number of days in month
				int numberOfDays = numberOfDaysInMonth(upperMonth, year);
				if (numberOfDays == 0) {
					System.out.println("Wrong input");
				} else {

					// Printing out the result
					System.out.println("Number of days in " + month + " of "
							+ year + " is " + numberOfDays);
				}
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Your input is wrong");
				uInput.nextLine();
			}

		} while (true);

		// Closing of scanner
		uInput.close();

	}

	public static int numberOfDaysInMonth(String month, int year) {
		// Method that returns number of days in given month
		if ((month.equals("JAN")) || (month.equals("MAR"))
				|| (month.equals("MAY")) || (month.equals("JUL "))
				|| (month.equals("AUG")) || (month.equals("OCT"))
				|| (month.equals("DEC"))) {
			return 31;
		} else if (month.equals("FEB")) {
			// Mathod call that checks if year is leap
			if (isLeapYear(year)) {
				return 29;
			} else {
				return 28;
			}
		} else if ((month.equals("APR")) || (month.equals("JUN"))
				|| (month.equals("SEP")) || (month.equals("NOV"))) {
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
