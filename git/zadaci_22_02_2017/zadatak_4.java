package zadaci_22_02_2017;

import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja izračunava zbir svih brojeva u cijelom broju.
		 * Koristite sljedeći header: public static int sumDigits(long n). Na
		 * primjer, ako pozovemo metodu i proslijedimo joj broj 234
		 * (sumDigits(234)) metoda treba da vrati 9. (2 + 3 + 4 = 9)
		 */

		Scanner uInput = new Scanner(System.in);
		// Calling method that inpust long number
		long number = methods.User_Input.positiveLongInput(uInput,
				"Enter number of long type");

		int sumOfDigits = sumDigits(number);

		
		//Printing out the reuslt
		System.out.println("Sum of digits of number " + number + " is "
				+ sumOfDigits);
		uInput.close();
	}

	public static int sumDigits(long n) {
		//method that returns sum of digits
		int sum = 0;
		String sN = n + "";
		for (int i = sN.length() - 1; i >= 0; i--) {
			sum += Integer.parseInt(sN.charAt(i) + "");

		}

		return sum;
	}

}
