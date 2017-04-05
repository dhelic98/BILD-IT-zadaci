package zadaci_05_04_2017;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Maximum element in an array) Implement the following method that
		 * returns the maximum element in an array. public static <E extends
		 * Comparable<E>> E max(E[] list)
		 */
		// Generating array
		Integer[] list = new Integer[10];
		for (int i = 0; i < list.length; i++) {
			list[i] = (int) (Math.random() * 16);
		}

		// Printing out results
		System.out.println("Largest number in the array is " + max(list));

	}

	public static <E extends Comparable<E>> E max(E[] list) {
		// Method for locating largest element in array
		E currentMax = list[0];
		for (int i = 0; i < list.length; i++)
			if (list[i].compareTo(currentMax) > 0)
				currentMax = list[i];
		return currentMax;
	}

}
