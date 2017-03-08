package zadaci_08_03_2017;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * (Largest rows and columns) Write a program that randomly fills in 0s
		 * and 1s into an n-by-n matrix, prints the matrix, and finds the rows
		 * and columns with the most 1s. (Hint: Use two ArrayLists to store the
		 * row and column indices with the most 1s.)
		 */

		Scanner uInput = new Scanner(System.in);
		while (true) {
			// Getting input by user
			int size = methods.User_Input.positiveIntInput(uInput,
					"Enter size of matrix, 50 is limit");
			if (size == 0 || size > 50) {
				continue;
			} else {
				// Initializing, filling and printing out array
				int[][] array = new int[size][size];
				fillArrray(array);
				printArray(array);

				// Intiializing and callling methods for arrayLists
				ArrayList<Integer> rows = getLargerstRow(array);
				ArrayList<Integer> column = getLargerstColumn(array);
				// Printing out results
				System.out.println("Rows with most 1's are: ");
				for (int i = 0; i < rows.size(); i++) {
					System.out.print(rows.get(i) + ", ");

				}
				System.out.println("\nColumns with most 1's are:");
				for (int i = 0; i < column.size(); i++) {
					System.out.print(column.get(i) + ", ");

				}
			}

			break;

		}
		uInput.close();

	}

	public static void fillArrray(int[][] m) {
		// Method for randomly filling array
		Random rand = new Random();
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = rand.nextInt(2);

			}
		}

	}

	public static void printArray(int[][] m) {
		// Printing array
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static ArrayList<Integer> getLargerstRow(int[][] m) {
		// Method that returns rows that contain most 1's
		ArrayList<Integer> row = new ArrayList<>();
		int max = 0;

		for (int i = 0; i < m.length; i++) {
			int oneCounter = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1) {
					oneCounter++;
				}

			}
			if (oneCounter > max) {
				max = oneCounter;
				row.clear();
				row.add(i);
			} else if (oneCounter == max) {
				row.add(i);
			}
		}

		return row;

	}

	public static ArrayList<Integer> getLargerstColumn(int[][] m) {
		// Method that returns columns that contain most 1's
		ArrayList<Integer> Column = new ArrayList<>();
		int max = 0;

		for (int i = 0; i < m.length; i++) {
			int oneCounter = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[j][i] == 1) {
					oneCounter++;
				}

			}
			if (oneCounter > max) {
				max = oneCounter;
				Column.clear();
				Column.add(i);
			} else if (oneCounter == max) {
				Column.add(i);
			}
		}

		return Column;

	}
}
