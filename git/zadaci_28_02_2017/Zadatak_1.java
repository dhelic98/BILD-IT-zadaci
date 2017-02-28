package zadaci_28_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * *8.26 (Row sorting) Implement the following method to sort the rows
		 * in a twodimensional array. A new array is returned and the original
		 * array is intact. public static double[][] sortRows(double[][] m)
		 * Write a test program that prompts the user to enter a 3 * 3 matrix of
		 * double values and displays a new row-sorted matrix
		 */

		Scanner uInput = new Scanner(System.in);
		// Initializing arrays
		double[][] matrix = new double[3][3];

		// Input by user for m
		System.out.println("Enter numbers into 3x3 matrix 1.");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = methods.User_Input.positiveDoubleInput(uInput,
						"Enter number here");

			}

		}
		// Printing out original array
		System.out.println("Original array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("% 6.2f", matrix[i][j]);

			}
			System.out.println();

		}
		System.out.println();
		System.out.println("Sorted array rows:");
		// Calling method for sorting array
		double[][] sortedRows = sortRows(matrix);
		for (int i = 0; i < sortedRows.length; i++) {
			for (int j = 0; j < sortedRows[i].length; j++) {
				System.out.printf("% 6.2f", sortedRows[i][j]);

			}
			System.out.println();

		}

	}

	public static double[][] sortRows(double[][] m) {
		// Sorting arrays
		double[][] sortedRows = new double[3][3];
		ArrayList<Double> list = new ArrayList<>();
		// Sorting rows
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				list.add(m[i][j]);

			}
			Collections.sort(list);
			for (int k = 0; k < m[i].length; k++) {
				sortedRows[i][k] = list.get(k);

			}
			list.clear();

		}

		return sortedRows;
	}
}
