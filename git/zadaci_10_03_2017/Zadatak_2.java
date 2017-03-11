package zadaci_10_03_2017;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * OutOfMemoryError) Write a program that causes the JVM to throw an
		 * OutOfMemoryError and catches and handles this error.
		 */

		// Testing OutOfMemoryError
		try {

			char[] m = new char[734343434];
		} catch (OutOfMemoryError ex) {
			System.out.println(ex.getMessage());
		}

	}

}
