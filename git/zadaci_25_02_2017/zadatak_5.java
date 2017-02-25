package zadaci_25_02_2017;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Algebra: add two matrices) Write a method to add two matrices. The
		 * header of the method is as follows: public static double[][]
		 * addMatrix(double[][] a, double[][] b)
		 * 
		 * Write a test program that prompts the user to enter two 3 * 3
		 * matrices and displays their sum. Here is a sample run:
		 */

		Scanner uInput = new Scanner(System.in);
		// Initializing arrays
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		// Input by user for m1
		System.out.println("Enter numbers into 3x3 matrix 1.");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = methods.User_Input.positiveDoubleInput(uInput,
						"Enter number here");
			}
		}
		// Input by user into m2
		System.out.println("Enter numbers into 3x3 matrix 2.");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = methods.User_Input.positiveDoubleInput(uInput,
						"Enter number here");
			}
		}
		// Initializing sum array
		double[][] sum = addMatrix(matrix1, matrix2);
		// Printing out the result
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			if (i == 1) {
				System.out.print("  +  ");
			} else {
				System.out.print("\t ");
			}
			for (int k = 0; k < matrix2[i].length; k++) {
				System.out.print(matrix2[i][k] + " ");

			}
			if (i == 1) {
				System.out.print(" =  ");
			} else {
				System.out.print("\t ");
			}
			for (int l = 0; l < sum[i].length; l++) {
				System.out.print(sum[i][l] + " ");
			}

			System.out.println();
		}

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {
		// method that sums numbers in arrays
		double[][] sum = new double[3][3];
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];

			}
		}

		return sum;

	}

}
