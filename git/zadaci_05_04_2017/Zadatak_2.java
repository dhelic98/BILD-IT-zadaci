package zadaci_05_04_2017;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Generic linear search) Implement the following generic method for
		 * linear search. public static <E extends Comparable<E>> int
		 * linearSearch(E[] list, E key)
		 */

		Scanner uInput = new Scanner(System.in);

		//Generating array
		Integer[] list = new Integer[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 16);
		}

		int number = methods.User_Input.positiveIntInput(uInput,
				"Enter number that you want to search for in array.1-15");

		while (number == 0 || number > 15) {
			number = methods.User_Input.positiveIntInput(uInput,
					"Enter number that you want to search for in array.1-15");

		}
//Printing out result
		System.out.println("Your number is at position "
				+ linearSearch(list, number));

	}

	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		//Method for linear search
		for (int i = 0; i < list.length; i++) {
			if (key.compareTo(list[i]) == 0)
				return i;
		}
		return -1;
	}

}
