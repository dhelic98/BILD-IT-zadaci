package zadaci_18_02_2017;

import java.util.Calendar;
import java.util.GregorianCalendar;

import sun.util.calendar.CalendarDate;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Ako pozovemo metodu System.currentTimeMillis() dobijemo broj
		 * milisekundi od 1. januara 1970 do trenutka pozivanja metode. Napisati
		 * program koji ispisuje trenutačni datum i vrijeme u formatu
		 * "Trenutni datum i vrijeme: 22. juli, 2015 19:59:47"
		 */
		try { 
			//Printing out the time
			System.out.println("Trenutni datum i vrjeme: " + getDate() + " "
					+ getTime());
		} catch (Exception ex) {
			System.out.println("There was an exception");
		}

	}

	public static String getTime() {
		//Method that finds current time 
		String currentTime = "";

		long milliSecond = System.currentTimeMillis();

		long totalSeconds = (milliSecond / 1000) + 3600;
		long currentSeconds = totalSeconds % 60;

		long totalMinutes = totalSeconds / 60;
		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;
		long currentHours = totalHours % 24;

		currentTime += ((currentHours < 10) ? "0" + currentHours : currentHours)
				+ ":"
				+ ((currentMinutes < 10) ? "0" + currentMinutes
						: currentMinutes
								+ ":"
								+ ((currentSeconds < 10) ? "0" + currentSeconds
										: currentSeconds));

		return currentTime;

	}

	public static String getDate() {
		//Finding current date
		Calendar cal = new GregorianCalendar();

		return cal.get(Calendar.DATE) + ". "
				+ getMonthName(cal.get(Calendar.MONTH) + 1) + " "
				+ cal.get(Calendar.YEAR);
	}

	public static String getMonthName(int i) {
		//Method that returns name of the month
		switch (i) {
		case 1:
			return "Januar";
		case 2:
			return "Februar";
		case 3:
			return "Mart";
		case 4:
			return "April";
		case 5:
			return "Maj";
		case 6:
			return "Juni";
		case 7:
			return "Juli";
		case 8:
			return "August";
		case 9:
			return "Septembar";
		case 10:
			return "Oktobar";
		case 11:
			return "Novembar";
		case 12:
			return "Decembar";
		default:
			return "Wrong";

		}
	}
}
