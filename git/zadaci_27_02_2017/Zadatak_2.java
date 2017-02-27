package zadaci_27_02_2017;

import java.util.Scanner;

public class Zadatak_2 {

	public static void main(String[] args) {
		// 8.6(multiplying matrices)
		/*
		 * To multiply matrix a by matrix b, the number of columns in a must be
		 * the same as the number of rows in b, and the two matrices must have
		 * elements of the same or compatible types. Let c be the result of the
		 * multiplication. Assume the column size of matrix a is n. Each element
		 * cij is ai1 * b1j + ai2 * b2j + c + ain * bnj.
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
//Declaring array with results and calling method
		double[][] result = multiplyMatrix(matrix1, matrix2);
		//Loop for output
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + " ");
			}
			if (i == 1) {
				System.out.print("  *  ");
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
			for (int l = 0; l < result[i].length; l++) {
				System.out.printf("%4.2f", result[i][l]);
				System.out.print(" ");
			}

			System.out.println();
		}

	}

	public static double[][] multiplyMatrix(double[][] a, double[][] b) { 
		//Method that multyplies the array-s
		double[][] result = new double[3][3];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = ((a[i][0] * b[0][j]) + (a[i][1] * b[1][j]) + (a[i][2] * b[2][j]));
			}

		}

		return result;

	}

}
