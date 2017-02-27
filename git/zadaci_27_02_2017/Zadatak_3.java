package zadaci_27_02_2017;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Largest row and column) Write a program that randomly fills in 0s
		 * and 1s into a 4-by-4 matrix, prints the matrix, and finds the first
		 * row and column with the most 1s.
		 */

		// initializing array
		int[][] randomFill = new int[4][4];

		// filling array
		for (int i = 0; i < randomFill.length; i++) {
			for (int j = 0; j < randomFill[i].length; j++) {
				randomFill[i][j] = (int) (Math.random() * 2);
				System.out.print(randomFill[i][j] + " ");

			}
			System.out.println();

		}

		// Initializing variables for finding largest column and row
		int maxRow = 0;
		int maxColumn = 0;
		int indexRow = 0;
		int indexColumn = 0;
		int counter = 0;

		// Counting rows
		for (int i = 0; i < randomFill.length; i++) {
			counter = 0;
			for (int j = 0; j < randomFill[i].length; j++) {
				if (randomFill[i][j] == 1) {
					counter++;
				}

			}
			if (counter > maxRow) {
				indexRow = i;
				maxRow = counter;
			}

		}
		// Counting colums
		for (int i = 0; i < randomFill.length; i++) {
			counter = 0;
			for (int j = 0; j < randomFill[i].length; j++) {
				if (randomFill[j][i] == 1) {
					counter++;
				}

			}
			if (counter > maxColumn) {
				indexColumn = i;
				maxColumn = counter;

			}

		}

		// Printing out indexes
		System.out.println("Largest row index is " + indexRow);
		System.out.println("Largest column index is " + indexColumn);

	}

}
