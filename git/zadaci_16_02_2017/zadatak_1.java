package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji pita korisnika da unese cijeli broj za
		 * današnji dan u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese
		 * broj dana nakon današnjeg dana te mu ispiše koji je to dan u
		 * budućnosti. (Primjer: ako korisnik unese 1 kao današnji dan a 3 kao
		 * dan u budućnosti program mu ispisuje da je danas utorak a dan u
		 * budućnosti je petak.)
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				//user input
				System.out
						.println("Enter whole number for day in a week(0-Monday, 1-Tuesday,2-Wednesday,...)");
				int firstDay = uInput.nextInt();
				//Condition for day of the week
				while ((firstDay < 0) || (firstDay > 6)) {
					System.out
							.println("Number must be between 0 and 6.Please input again");
					firstDay = uInput.nextInt();
				}
				//user input
				System.out.println("Enter number of days that passed");
				int daysPassed = uInput.nextInt();
				//Condition for days passed
				while ((daysPassed < 0)) {
					System.out
							.println("Please enter again.Your input is wrong");
					daysPassed = uInput.nextInt();
				}
				// Printig out the result
				System.out.println("Day that will be after " + daysPassed
						+ " days have passed is "
						+ dayInWeek(firstDay, daysPassed));
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Exception in input");
				uInput.nextLine();
			}

		} while (true);
		//closing scanner
		uInput.close();

	}

	public static String dayInWeek(int firstDay, int daysPassed) {
		// Method that will find which day it is after enterd number of days
		// passed
		while (daysPassed > 6) {

			daysPassed -= (7 - firstDay);
			firstDay = 0;

		}
		int day = firstDay + daysPassed;

		switch (day) {
		case (0):
			return "Monday";
		case (1):
			return "Tuesday";
		case (2):
			return "Wednesday";
		case (3):
			return "Thursday";
		case (4):
			return "Friday";
		case (5):
			return "Saturday";
		case (6):
			return "Sunday";
		default:
			return "Wrong day";
		}
	}

}
