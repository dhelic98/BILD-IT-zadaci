package zadaci_27_02_2017;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Sort two-dimensional array) Write a method to sort a two-dimensional
		 * array using the following header: public static void sort(int m[][])
		 * The method performs a primary sort on rows and a secondary sort on
		 * columns.
		 */
		Scanner uInput = new Scanner(System.in);
		// Initializing arrays
		int[][] matrix = new int[6][2];

		// Input by user for m1
		System.out.println("Enter numbers into 6x2 matrix.");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = methods.User_Input.positiveIntInput(uInput,
						"Enter number here");
			}
		}

		// Calling method for sort
		sort(matrix);

	}

	public static void sort(int m[][]) {
		// Sorting arrays
		ArrayList<Integer> list = new ArrayList<>();
		// Sorting rows
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				list.add(m[i][j]);

			}
			Collections.sort(list);
			for (int k = 0; k < m[i].length; k++) {
				m[i][k] = list.get(k);

			}
			list.clear();

		}

		// loop for sorting columns
		for (int i = 0; i < m[0].length; i++) {
			for (int j = 0; j < m.length; j++) {
				list.add(m[j][i]);

			}
			Collections.sort(list);
			for (int k = 0; k < m.length; k++) {
				m[k][i] = list.get(k);

			}
			list.clear();

		}
		// Printing out the result
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

			}
			System.out.println();

		}
	}

}
