package zadaci_28_02_2017;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * The return value is an instance of Location. Write a test program
		 * that prompts the user to enter a two-dimensional array and displays
		 * the location of the largest element in the array. Here is a sample
		 * run:
		 */

		Scanner uInput = new Scanner(System.in);

		int row = 0;
		int column = 0;

		while (true) {

			// Inputing size of array
			row = methods.User_Input.positiveIntInput(uInput,
					"Enter number of rows");
			if (row == 0) {
				continue;
			}
			column = methods.User_Input.positiveIntInput(uInput,
					"Enter number of columns");
			if (column == 0) {
				continue;
			}
			break;
		}
		// Initializing arrays
		double[][] matrix = new double[row][column];

		// Input by user for m
		System.out.println("Enter numbers into matrix.");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = methods.User_Input.positiveDoubleInput(uInput,
						"Enter number here");

			}

		}
		// Calling method and printing out the result
		Location location = locateLargest(matrix);
		System.out.println(location.toString());

	}

	public static Location locateLargest(double[][] a) {
		// Method that finds and returns location
		double max = 0;
		int row = 0;
		int column = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > max) {
					max = a[i][j];
					row = i;
					column = j;
				}

			}

		}
		Location loc = new Location(row, column, max);

		return loc;
	}
}
