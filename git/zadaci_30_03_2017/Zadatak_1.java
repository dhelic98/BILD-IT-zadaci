package zadaci_14_03_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Zadatak_1 {

	public static void main(String[] args) {

		/*
		 * (Display calendars) Rewrite the PrintCalendar class in Listing 6.12
		 * to display a calendar for a specified month using the Calendar and
		 * GregorianCalendar classes. Your program receives the month and year
		 * from the command line. For example: java Exercise13_04 5 2016
		 */

		Calendar calendar = new GregorianCalendar();
		try {
			if (args.length == 2) {
				int year = Integer.parseInt(args[1]);
				int month = getMonth(args[0]);
				calendar.clear();
				// Setting up values for calendar
				calendar.set(year, month - 1, 1);

				int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);
				int numberOfDaysInMonth = calendar
						.getActualMaximum(Calendar.DAY_OF_MONTH);

				int printDay = 0;
				System.out.println("Calendar for " + month + " " + year);
				// Printing header
				System.out.println("-----------------------------------");
				System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
				System.out.println("-----------------------------------");
				// Loop that prints empty places
				for (int day = 1; day < firstDayOfMonth; day++) {
					System.out.print("     ");
					printDay++;
				}
				// Loop for printing days
				for (int day = 1; day <= numberOfDaysInMonth; day++) {
					// if number is 1 digit it will print with 2 spaces on both
					// sides
					if (day < 10) {
						System.out.print("  " + day + "  ");
					} else {
						System.out.print(" " + day + "  ");
					}
					printDay++;

					// condition for new line
					if (printDay % 7 == 0) {
						System.out.println();
					}

				}

			} else if (args.length == 1) {

				int year = Calendar.getInstance().get(Calendar.YEAR);
				int month = getMonth(args[0]);
				calendar.clear();
				// Setting up values for calendar
				calendar.set(year, month - 1, 1);

				int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);
				int numberOfDaysInMonth = calendar
						.getActualMaximum(Calendar.DAY_OF_MONTH);

				int printDay = 0;
				System.out.println("Calendar for " + month + " " + year);
				// Printing header
				System.out.println("-----------------------------------");
				System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
				System.out.println("-----------------------------------");
				// Loop that prints empty places
				for (int day = 1; day < firstDayOfMonth; day++) {
					System.out.print("     ");
					printDay++;
				}
				// Loop for printing days
				for (int day = 1; day <= numberOfDaysInMonth; day++) {
					// if number is 1 digit it will print with 2 spaces on both
					// sides
					if (day < 10) {
						System.out.print("  " + day + "  ");
					} else {
						System.out.print(" " + day + "  ");
					}
					printDay++;

					// condition for new line
					if (printDay % 7 == 0) {
						System.out.println();
					}

				}

			} else if (args.length == 0) {

				int year = Calendar.getInstance().get(Calendar.YEAR);
				int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
				calendar.clear();
				// Setting up values for calendar
				calendar.set(year, month - 1, 1);

				int firstDayOfMonth = calendar.get(Calendar.DAY_OF_WEEK);
				int numberOfDaysInMonth = calendar
						.getActualMaximum(Calendar.DAY_OF_MONTH);

				int printDay = 0;
				System.out.println("Calendar for " + month + " " + year);
				// Printing header
				System.out.println("-----------------------------------");
				System.out.println(" Sun  Mon  Tue  Wed  Thu  Fri  Sat ");
				System.out.println("-----------------------------------");
				// Loop that prints empty places
				for (int day = 1; day < firstDayOfMonth; day++) {
					System.out.print("     ");
					printDay++;
				}
				// Loop for printing days
				for (int day = 1; day <= numberOfDaysInMonth; day++) {
					// if number is 1 digit it will print with 2 spaces on both
					// sides
					if (day < 10) {
						System.out.print("  " + day + "  ");
					} else {
						System.out.print(" " + day + "  ");
					}
					printDay++;

					// condition for new line
					if (printDay % 7 == 0) {
						System.out.println();
					}

				}

			} else {
				System.out.println("Error");
				System.exit(0);
			}
		} catch (Exception ex) {
			System.out.println("Exception");
		}
	}

	public static int getMonth(String m) {
		switch (m) {
		case "January":
			return 1;
		case "February":
			return 2;
		case "March":
			return 3;
		case "April":
			return 4;
		case "May":
			return 5;
		case "June":
			return 6;
		case "July":
			return 7;
		case "August":
			return 8;
		case "September":
			return 9;
		case "October":
			return 10;
		case "November":
			return 11;
		case "December":
			return 12;
		default:
			return -1;

		}
	}

}
