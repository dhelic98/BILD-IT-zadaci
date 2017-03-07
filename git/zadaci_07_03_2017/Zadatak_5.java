package zadaci_07_03_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Shuffle ArrayList) Write the following method that shuffles the
		 * elements in an ArrayList of integers. public static void
		 * shuffle(ArrayList<Integer> list)
		 */

		Scanner uInput = new Scanner(System.in);
		// Initializing array and populating it with 10 integers
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			int number = methods.User_Input.positiveIntInput(uInput, "Enter "
					+ (i + 1) + ". number");
			list.add(number);

		}
		// Calling method for shuffle
		shuffle(list);
		// Printing out shuffeled list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}

	}

	public static void shuffle(ArrayList<Integer> list) {
		Collections.shuffle(list);

	}

}
