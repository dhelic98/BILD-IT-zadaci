package zadaci_13_03_2017;

import java.util.*;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Sort ArrayList) Write the following method that sorts an ArrayList
		 * of numbers. public static void sort(ArrayList<Number> list)
		 */

		// Initializing random
		Random rand = new Random();
		// Initializing arrayList
		ArrayList<Number> list = new ArrayList<>();
		// Generating random numbers
		for (int i = 0; i < 25; i++) {
			list.add(rand.nextInt(100));
		}
		// Calling method
		sort(list);
		for (int i = 0; i < list.size(); i++) {
			// Loop for printing out result
			System.out.print(list.get(i) + " ");

		}

	}

	public static void sort(ArrayList<Number> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			// Find the mimimum in the list
			Number min = list.get(i);
			int minIndex = i;

			for (int j = i + 1; j < list.size(); j++) {
				if (min.doubleValue() > list.get(j).doubleValue()) {
					min = list.get(j);
					minIndex = j;
				}
			}

			// Swap list.get(i) with list.get(minIndex) if necessary
			if (minIndex != i) {
				list.set(minIndex, list.get(i));
				list.set(i, min);
			}
		}
	}

}
