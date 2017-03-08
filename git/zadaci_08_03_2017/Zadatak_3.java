package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Sum ArrayList) Write the following method that returns the sum of
		 * all numbers in an ArrayList: public static double
		 * sum(ArrayList<Double> list) Write a test program that prompts the
		 * user to enter 5 numbers, stores them in an array list, and displays
		 * their sum.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Initializing arrayList
				ArrayList<Double> list = new ArrayList<>();
				// Input by user
				System.out.println("Enter 5 numbers please");
				for (int i = 0; i < 5; i++) {
					double number = methods.User_Input.doubleInput(uInput,
							"Enter number");
					list.add(number);

				}
				// Calling method for sum
				double sum = sum(list);

				System.out.println("Sum of input numbers is " + sum);
				break;

			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);

		uInput.close();

	}

	public static double sum(ArrayList<Double> list) {
		// Method that returns sum od arrayList
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);

		}

		return sum;
	}

}
