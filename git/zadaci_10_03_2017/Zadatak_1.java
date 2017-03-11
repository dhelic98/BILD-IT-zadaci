package zadaci_10_03_2017;

import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * (NumberFormatException) Write the bin2Dec(String binaryString) method
		 * to convert a binary string into a decimal number. Implement the
		 * bin2Dec method to throw a NumberFormatException if the string is not
		 * a binary string.
		 */

		// Input by user
		Scanner uInput = new Scanner(System.in);
		System.out.println("Enter Binary String");
		String binaryString = uInput.nextLine();

		try {
			// Printing our result
			System.out.println("Binary " + binaryString
					+ "\nWhen converted is " + binaryToDecimal(binaryString));
		} catch (NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}

	}

	public static int binaryToDecimal(String binaryString) {
		// Method for converting from binary to decimal

		long sum = 0;
		if (isBinary(binaryString)) {
			int decimal = Integer.parseInt(binaryString, 2);
			sum += decimal;
		}
		return (int) sum;
	}

	public static boolean isBinary(String binaryString) {
		// method that checks if string is binary
		boolean is = true;
		for (int i = 0; i < binaryString.length(); i++) {

			if (binaryString.charAt(i) == '1' || binaryString.charAt(i) == '0') {
				continue;
			} else {
				is = false;
				throw new NumberFormatException("Number "
						+ binaryString.charAt(i) + " is not binary digit.");
			}

		}
		return is;
	}

}
