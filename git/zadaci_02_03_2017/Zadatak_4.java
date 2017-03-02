package zadaci_02_03_2017;

import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Draw the UML diagram for the class and then implement the class.
		 * Write a test program that prompts the user to enter a, b, c, d, e,
		 * and f and displays the result. If ad - bc is 0, report that “The
		 * equation has no solution.” See Programming Exercise 3.3 for sample
		 * runs.
		 */

		Scanner uInput = new Scanner(System.in);

		// User input
		double a = methods.User_Input.doubleInput(uInput, "Enter a:");
		double b = methods.User_Input.doubleInput(uInput, "Enter b:");
		double c = methods.User_Input.doubleInput(uInput, "Enter c:");
		double d = methods.User_Input.doubleInput(uInput, "Enter d:");
		double e = methods.User_Input.doubleInput(uInput, "Enter e:");
		double f = methods.User_Input.doubleInput(uInput, "Enter f:");

		LinearEquation lin = new LinearEquation(a, b, c, d, e, f);

		if (!lin.isSolvable()) {
			System.out.println("The equation has no solution");
		} else {
			System.out.print("X: is ");
			System.out.printf("%5.2f", lin.getX());
			System.out.print("\nY: is ");
			System.out.printf("%5.2f", lin.getY());
		}

	}

}
