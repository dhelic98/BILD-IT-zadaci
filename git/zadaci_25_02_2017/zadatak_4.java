package zadaci_25_02_2017;

import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 8.1(Sum elements column by column) Write a method that returns the
		 * sum of all the elements in a specified column in a matrix using the
		 * following header: public static double sumColumn(double[][] m, int
		 * columnIndex)
		 * 
		 * Write a test program that reads a 3-by-4 matrix and displays the sum
		 * of each column. Here is a sample run:
		 */

		Scanner uInput = new Scanner(System.in);
		double[][] matrix = new double[3][4];
		// Input by user
		System.out.println("Enter numbers into 3 by 4 matrix");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = methods.User_Input.positiveDoubleInput(uInput,
						"Enter number");
			}
		}
		// Calculating the summ
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// Printing out the result
				System.out.println("Sum of numbers on column " + j + " is "
						+ sumColumn(matrix, j));

			}
			break;

		}

		uInput.close();

	}

	public static double sumColumn(double[][] m, int columnIndex) {
		// Method for summing columns
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}

		return sum;
	}

}
