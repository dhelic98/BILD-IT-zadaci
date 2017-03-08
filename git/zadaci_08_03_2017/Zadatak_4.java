package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Remove duplicates) Write a method that removes the duplicate
		 * elements from an array list of integers using the following header:
		 * public static void removeDuplicate(ArrayList<Integer> list) Write a
		 * test program that prompts the user to enter 10 integers to a list and
		 * displays the distinct integers separated by exactly one space.
		 */
		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// Initializing arrayList
				ArrayList<Integer> list = new ArrayList<>();
				// Input by user
				System.out.println("Enter 10 numbers please");
				for (int i = 0; i < 10; i++) {
					int number = methods.User_Input.intInput(uInput,
							"Enter number");
					list.add(number);

				}
				// Calling method for removing duplicates
				removeDuplicate(list);

				// Printing out results
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

	public static void removeDuplicate(ArrayList<Integer> list) {
		
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			if (temp.contains(list.get(i))) {
				continue;
			} else {
				temp.add(list.get(i));
			}
		}
		list.clear();
		list.addAll(temp);
	}

}
