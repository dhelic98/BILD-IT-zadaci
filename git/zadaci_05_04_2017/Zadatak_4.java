package zadaci_05_04_2017;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Maximum element in a two-dimensional array) Write a generic method
		 * that returns the maximum element in a two-dimensional array. public
		 * static <E extends Comparable<E>> E max(E[][] list)
		 */

		// Generating array
		Integer[][] list = new Integer[10][10];
		for (int i = 0; i < list.length; i++) {
			for (int k = 0; k < list.length; k++) {

				list[i][k] = (int) (Math.random() * 16);
			}
		}

		System.out.println("Largest number in 2d array is " + max(list));
	}

	public static <E extends Comparable<E>> E max(E[][] list) {
		// Method for finding largest in 2d array
		E currentMax = list[0][0];
		for (int i = 0; i < list.length; i++)
			for (int j = 0; j < list[0].length; j++)
				if (list[i][j].compareTo(currentMax) > 0)
					currentMax = list[i][j];
		return currentMax;
	}

}
