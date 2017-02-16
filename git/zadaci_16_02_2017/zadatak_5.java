package zadaci_16_02_2017;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati metodu koja pretavara milisekunde u sate, minute i
		 * sekunde. Metoda treba da koristi sljedeći header: public static
		 * String convertMillis(long millis). Metoda treba da vraća vrijeme kao
		 * string u formatu sati:minute:sekunde. Na primjer
		 * convertMillis(100000) treba da vrati 0:1:40.
		 */

		// Printing out the result of method
		System.out.println(convertMillis(100000));

	}

	public static String convertMillis(long millis) {
		// Method that converts milliseconds to seconds,minutes and hours

		// Declaring String timeConverted that will be returned
		String timeConverted = "";

		// converting from milliseconds to seconds
		int totalSeconds = (int) (millis / 1000);
		int currentSeconds = totalSeconds % 60;

		// converting from second to minutes
		int totalMinutes = totalSeconds / 60;
		int currentMinutes = totalMinutes % 60;

		// Converting from minutes to hours
		int currentHours = totalMinutes / 60;

		// Strings that will be return as part of timeConverted
		String second = "" + currentSeconds;
		String minutes = "" + currentMinutes;
		String hours = "" + currentHours;

		if (currentMinutes < 10) {
			minutes = "0" + currentMinutes;
		}
		if (currentSeconds < 10) {
			second = "0" + currentSeconds;
		}
		if (currentHours < 10) {
			hours = "0" + currentHours;
		}
		// Building String timeConverted
		timeConverted = hours + ":" + minutes + ":" + second;

		// returning string
		return timeConverted;
	}

}
