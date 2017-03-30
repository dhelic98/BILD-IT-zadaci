package zadaci_13_03_2017;

import java.util.*;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Shuffle ArrayList) Write the following method that shuffles an
		 * ArrayList of numbers: public static void shuffle(ArrayList<Number>
		 * list)
		 */

		// Initializing random
		Random rand = new Random();
		// Initializing arrayList
		ArrayList<Number> list = new ArrayList<>();
		// Generating random numbers
		for (int i = 0; i < 25; i++) {
			list.add(rand.nextInt(100));
		}
		shuffle(list);
		for (int i = 0; i < list.size(); i++) {
			// Loop for printing out result
			System.out.print(list.get(i) + " ");

		}

	}

	public static void shuffle(ArrayList<Number> list) {
		// Method for shuffling list
		Collections.shuffle(list);
	}

}
