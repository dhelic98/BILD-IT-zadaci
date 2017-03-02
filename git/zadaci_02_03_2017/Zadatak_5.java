package zadaci_02_03_2017;

import java.util.Scanner;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Geometry: intersecting point) Suppose two line segments intersect.
		 * The two endpoints for the first line segment are (x1, y1) and (x2,
		 * y2) and for the second line segment are (x3, y3) and (x4, y4). Write
		 * a program that prompts the user to enter these four endpoints and
		 * displays the intersecting point. As discussed in Programming Exercise
		 * 3.25, the intersecting point can be found by solving a linear
		 * equation. Use the LinearEquation class in Programming Exercise 9.11
		 * to solve this equation. See Programming Exercise 3.25 for sample
		 * runs.
		 */

		Scanner uInput = new Scanner(System.in);

		// User input
		double x1 = methods.User_Input.doubleInput(uInput, "Enter x1:");
		double y1 = methods.User_Input.doubleInput(uInput, "Enter y1:");
		double x2 = methods.User_Input.doubleInput(uInput, "Enter x2:");
		double y2 = methods.User_Input.doubleInput(uInput, "Enter y2:");
		double x3 = methods.User_Input.doubleInput(uInput, "Enter x3:");
		double y3 = methods.User_Input.doubleInput(uInput, "Enter y3:");
		double x4 = methods.User_Input.doubleInput(uInput, "Enter x4:");
		double y4 = methods.User_Input.doubleInput(uInput, "Enter y4:");

		//Changing points into numbers for linear equation
		double a = y1 - y2;
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;

		// Creating object

		LinearEquation linear = new LinearEquation(a, b, c, d, e, f);
		// Printing out result
		if (!linear.isSolvable()) {
			System.out.println("Lines are parallel");
		} else {
			System.out.println("Points of intersection are : " + linear.getX()
					+ " and " + linear.getY());
		}

	}

}
