package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Maximum element in ArrayList) Write the following method that
		 * returns the maximum value in an ArrayList of integers. The method
		 * returns null if the list is null or the list size is 0. public static
		 * Integer max(ArrayList<Integer> list)
		 */

		Scanner uInput = new Scanner(System.in);
		// Initializing array and populating it with 10 integers
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int number = methods.User_Input.positiveIntInput(uInput, "Enter "
					+ (i + 1) + ". number");
			list.add(number);

		}
		// Calling method and printing out result
		Integer max = max(list);
		System.out.println("Biggest element in arrayList is " + max);

	}

	public static Integer max(ArrayList<Integer> list) {
		// Method that returns biggest Integer from arrayList
		if ((list.size() == 0) || (list == null)) {
			return null;

		}
		Integer max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}

		}

		return max;
	}

}
