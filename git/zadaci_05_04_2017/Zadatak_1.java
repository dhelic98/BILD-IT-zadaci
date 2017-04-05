package zadaci_05_04_2017;

import java.util.ArrayList;
import java.util.Collections;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * (Distinct elements in ArrayList) Write the following method that
		 * returns a new ArrayList. The new list contains the non-duplicate
		 * elements from the original list. public static <E> ArrayList<E>
		 * removeDuplicates(ArrayList<E> list)
		 */

		// Initializing array
		ArrayList<Integer> numbers = new ArrayList<>();

		// Generating numbers into list
		for (int i = 0; i < 15; i++) {
			numbers.add((int) (Math.random() * 10));
		}
		// Printing original list
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}

		System.out.println();
		// Calling method
		removeDuplicates(numbers);

		Collections.sort(numbers);

		for (int i = 0; i < numbers.size(); i++) {
			// Printing arrays without duplicates
			System.out.print(numbers.get(i) + " ");
		}

	}

	public static <E extends Comparable<E>> ArrayList<E> removeDuplicates(
			ArrayList<E> list) {

		// Method for removing duplicates
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (i == j) {
					continue;
				} else if (list.get(j).compareTo(list.get(i)) == 0) {

					list.remove(j);
					j--;

				}

			}

		}

		return list;

	}

}
