package zadaci_28_02_2017;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Stopwatch) Design a class named StopWatch. The class contains: ■
		 * Private data fields startTime and endTime with getter methods. ■ A
		 * no-arg constructor that initializes startTime with the current time.
		 * ■ A method named start() that resets the startTime to the current
		 * time. ■ A method named stop() that sets the endTime to the current
		 * time. ■ A method named getElapsedTime() that returns the elapsed time
		 * for the stopwatch in milliseconds. Draw the UML diagram for the class
		 * and then implement the class. Write a test program that measures the
		 * execution time of sorting 100,000 numbers using selection sort.
		 */

		// Initializing object
		Stopwatch stopwatch = new Stopwatch();

		// Declaring and filling out array
		int[] list = new int[100000];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 250 + 1);
		}

		// Starting stopwatch
		stopwatch.start();
		// sorting
		sorting(list);
		// ending stopwarch
		stopwatch.end();

		// Printing out result
		System.out.println("Elapsed time is " + stopwatch.getElapsedTime()
				+ " milliseconds or " + (stopwatch.getElapsedTime() / 1000.0)
				+ " seconds");

	}

	public static void sorting(int[] m) {
		// method for sorting int numbers
		for (int i = 0; i < m.length; i++) {
			for (int j = i + 1; j < m.length; j++) {
				if (m[i] > m[j]) {
					m[i] = m[j];

				}

			}
		}

	}

}
