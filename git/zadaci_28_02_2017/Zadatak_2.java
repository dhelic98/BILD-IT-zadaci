package zadaci_28_02_2017;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 8.28 (Strictly identical arrays) The two-dimensional arrays m1 and m2
		 * are strictly identical if their corresponding elements are equal.
		 * Write a method that returns true if m1 and m2 are strictly identical,
		 * using the following header: public static boolean equals(int[][] m1,
		 * int[][] m2) Write a test program that prompts the user to enter two 3
		 * * 3 arrays of integers and displays whether the two are strictly
		 * identical. Here are the sample runs.
		 */

		Scanner uInput = new Scanner(System.in);
		// Initializing arrays
		int[][] matrix1 = new int[3][3];
		int[][] matrix2 = new int[3][3];
		// Input by user for m1
		System.out.println("Enter numbers into 3x3 matrix 1.");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = methods.User_Input.positiveIntInput(uInput,
						"Enter number here");
			}
		}
		// Input by user into m2
		System.out.println("Enter numbers into 3x3 matrix 2.");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = methods.User_Input.positiveIntInput(uInput,
						"Enter number here");
			}
		}
		// Calling method
		if (equals(matrix1, matrix2)) {
			System.out.println("Both 2d arrays are strictly equal");
		} else {
			System.out.println("Arrays are not strictly equal");
		}

	}

	public static boolean equals(int[][] m1, int[][] m2) {
		// Method that checks if both arrays are strictly equal
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				if (m1[i][j] != m2[i][j]) {
					return false;
				}

			}

		}

		return true;
	}

}
