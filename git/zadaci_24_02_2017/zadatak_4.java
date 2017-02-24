package zadaci_24_02_2017;

import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu sa sljedećim headerom: public static String
		 * format(int number, int width) koja vraća string broja sa prefiksom od
		 * jedne ili više nula. Veličina stringa je width argument. Na primjer,
		 * ukoliko pozovemo metodu format(34, 4) metoda vraća 0034, ukoliko
		 * pozovemo format(34, 5) metoda vraća 00034. Ukoliko je uneseni broj
		 * veći nego width argument, metoda vraća samo string broja. Npr.
		 * ukoliko pozovemo format(34, 1) metoda vraća 34.
		 */

		Scanner uInput = new Scanner(System.in);

		// methods for input
		int number = methods.User_Input.positiveIntInput(uInput,
				"Enter positive whole number");
		int width = methods.User_Input.positiveIntInput(uInput,
				"Enter the width of number");
		// Calling method for converting
		String convert = format(number, width);
		System.out.println(convert);

	}

	public static String format(int number, int width) {
		// method that formats number input
		String formated = "";
		String sNumber = number + "";
		if (sNumber.length() > width) {
			return sNumber;
		} else {
			for (int i = 0; i < (width - sNumber.length()); i++) {
				formated += "0";

			}
			formated += sNumber;
		}

		return formated;

	}

}
