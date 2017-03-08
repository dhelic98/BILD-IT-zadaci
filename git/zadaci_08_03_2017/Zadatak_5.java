package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Combine two lists) Write a method that returns the union of two
		 * array lists of integers using the following header: public static
		 * ArrayList<Integer> union( ArrayList<Integer> list1,
		 * ArrayList<Integer> list2)
		 * 
		 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6}
		 * is {2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user
		 * to enter two lists, each with five integers, and displays their
		 * union. The numbers are separated by exactly one space in the output.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Initializing arrayList
				ArrayList<Integer> list1 = new ArrayList<>();
				ArrayList<Integer> list2 = new ArrayList<>();
				// Input by user
				System.out.println("Enter 5 numbers please into array 1.");
				for (int i = 0; i < 5; i++) {
					int number = methods.User_Input.intInput(uInput,
							"Enter number");
					list1.add(number);

				}
				System.out.println("Enter 5 numbers please into array 2.");
				for (int i = 0; i < 5; i++) {
					int number = methods.User_Input.intInput(uInput,
							"Enter number");
					list2.add(number);

				}
				// Calling method for union
				ArrayList<Integer> united = union(list1, list2);

				// Printing out results
				System.out.println("Lists combined:");
				for (int i = 0; i < united.size(); i++) {
					System.out.print(united.get(i) + " ");
				}

				break;

			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);

		uInput.close();

	}

	public static ArrayList<Integer> union(ArrayList<Integer> list1,
			ArrayList<Integer> list2) {
		// Method for combining arrayLists
		ArrayList<Integer> united = new ArrayList<>();
		united.addAll(list1);
		united.addAll(list2);

		return united;

	}
}
