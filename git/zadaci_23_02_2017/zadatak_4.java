package zadaci_23_02_2017;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja vraća datum i trenutačno vrijeme.
		 */
		
		//Declaring format 
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		
		//Declaring date 
		Date date = new Date();
		
		//Printing out
		System.out.println("Date is " + dateFormat.format(date));
		System.out.println("Time is " + timeFormat.format(date));

	}

}
