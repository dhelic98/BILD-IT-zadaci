package zadaci_27_02_2017;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Even number of 1s) Write a program that generates a 6-by-6
		 * two-dimensional matrix filled with 0s and 1s, displays the matrix,
		 * and checks if every row and every column have an even number of 1s.
		 */

		// Initializing array
		int[][] matrix = new int[6][6];

		int[] rowCount = new int[matrix.length];
		int[] colCount = new int[matrix[0].length];

		// Creating array and filling it out with 0s and 1s
		// Counting number of 1s
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
				System.out.print(matrix[i][j] + " ");
				if (matrix[i][j] == 1) {
					rowCount[i]++;
					colCount[j]++;
				}

			}
			System.out.println();

		}
		// Printing out row results
		for (int i = 0; i < rowCount.length; i++) {
			if (rowCount[i] % 2 == 0) {
				System.out.println("Row " + i + " has even number of 1s");
			} else {
				System.out.println("Row " + i
						+ " does not have even number of 1s");
			}
		}
		// Printing out column results
		for (int i = 0; i < colCount.length; i++) {
			if (colCount[i] % 2 == 0) {
				System.out.println("Column " + i + " has even number of 1s");
			} else {
				System.out.println("Column " + i
						+ " does not have even number of 1s");
			}
		}

	}
}
