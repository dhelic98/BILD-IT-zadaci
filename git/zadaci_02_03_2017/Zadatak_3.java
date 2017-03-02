package zadaci_02_03_2017;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * Draw the UML diagram for the class and then implement the class.
		 * Write a test program that prompts the user to enter values for a, b,
		 * and c and displays the result based on the discriminant. If the
		 * discriminant is positive, display the two roots. If the discriminant
		 * is 0, display the one root. Otherwise, display “The equation has no
		 * roots.” See Programming Exercise 3.1 for sample runs.
		 */

		Scanner uInput = new Scanner(System.in);

		// User input
		double a = methods.User_Input.doubleInput(uInput, "Enter a:");
		double b = methods.User_Input.doubleInput(uInput, "Enter b:");
		double c = methods.User_Input.doubleInput(uInput, "Enter c:");
		// Creating object and printing out the result for roots and
		// discriminant
		QuadraticEquation qequation = new QuadraticEquation(a, b, c);
		double discriminant = qequation.getDiscriminant();
		System.out.println(discriminant + " value of discriminant");
		// Printing out result
		if (discriminant > 0) {
			System.out.print("Root 1 is ");
			System.out.printf("%4.2f", qequation.getRoot1());
			System.out.print("\nRoot 2 is ");
			System.out.printf("%4.2f", qequation.getRoot2());
		} else if (discriminant == 0) {
			System.out.println("Root 1 is " + qequation.getRoot1());
		} else {
			System.out.println("The equation has no roots");
		}

	}

}
