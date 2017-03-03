package zadaci_03_03_2017;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Draw the UML diagram for the class and then implement the class.
		 * Write a test program that creates two Time objects (using new Time()
		 * and new Time(555550000)) and displays their hour, minute, and second
		 * in the format hour:minute:second.
		 */
		// Creating objects
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		// Printing out results
		System.out.println(time1.toString());
		System.out.println(time2.toString());
	}

}
