package zadaci_07_03_2017;

import java.util.Scanner;

public class Zadatak_1_test {

	public static void main(String[] args) {
		/*
		 * Draw the UML diagrams for the classes Triangle and GeometricObject
		 * and implement the classes. Write a test program that prompts the user
		 * to enter three sides of the triangle, a color, and a Boolean value to
		 * indicate whether the triangle is filled. The program should create a
		 * Triangle object with these sides and set the color and filled
		 * properties using the input. The program should display the area,
		 * perimeter, color, and true or false to indicate whether it is filled
		 * or not.
		 */
		// Input by user
		Scanner uInput = new Scanner(System.in);
		double side1 = methods.User_Input.positiveDoubleInput(uInput,
				"Enter 1. side of triangle");
		double side2 = methods.User_Input.positiveDoubleInput(uInput,
				"Enter 2. side of triangle");
		double side3 = methods.User_Input.positiveDoubleInput(uInput,
				"Enter 3. side of triangle");
		uInput.nextLine();
		Triangle triangle1 = new Triangle(side1, side2, side3);
		System.out.println("Enter colour");
		String colour = uInput.nextLine();
		triangle1.setColor(colour);

		// Loop that gets boolean if triangle is filled
		do {
			try {
				System.out
						.println("Is triangle filled?\n1.true\n2.false\nEnter your option by number");
				int option = uInput.nextInt();
				if (option == 1) {
					triangle1.setFilled(true);
				} else if (option == 2) {
					triangle1.setFilled(false);
				} else {
					continue;
				}

				break;
			} catch (Exception ex) {
				System.out.println("Exception try again");
				uInput.nextLine();
			}

		} while (true);
		// Printing out result
		System.out.println(triangle1.toString());
		System.out.println("Area of triangle is " + triangle1.getArea());
		System.out.println("Perimeter of triangle is "
				+ triangle1.getPerimeter());
		System.out.println("Colour is " + triangle1.getColor()
				+ " and is it filled? " + triangle1.isFilled());

	}

}
