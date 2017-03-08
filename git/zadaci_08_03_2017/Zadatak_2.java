package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Sort ArrayList) Write the following method that sorts an ArrayList
		 * of numbers: public static void sort(ArrayList<Integer> list) Write a
		 * test program that prompts the user to enter 5 numbers, stores them in
		 * an array list, and displays them in increasing order.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Initializing arrayList
				ArrayList<Integer> list = new ArrayList<>();
				// Input by user
				System.out.println("Enter 5 numbers please");
				for (int i = 0; i < 5; i++) {
					int number = methods.User_Input.intInput(uInput,
							"Enter number");
					list.add(number);

				}
				// Calling method for sort
				sort(list);

				for (int i = 0; i < list.size(); i++) {
					System.out.print(list.get(i) + " ");

				}
				break;

			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);

		uInput.close();

	}

	public static void sort(ArrayList<Integer> list) {
		// Method for selection sorting number

		for (int i = 0; i < list.size() - 1; i++) {
			int min = list.get(i);
			int index = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min > list.get(j)) {
					index = j;
					min = list.get(j);
				}
			}
			if (index != i) {
				list.set(index, list.get(i));
				list.set(i, min);

			}
		}
	}

}
