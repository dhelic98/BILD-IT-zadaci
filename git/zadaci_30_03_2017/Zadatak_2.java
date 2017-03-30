package zadaci_14_03_2017;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Enable GeometricObject comparable) Modify the GeometricObject class
		 * to implement the Comparable interface, and define a static max method
		 * in the GeometricObject class for finding the larger of two
		 * GeometricObject objects. Draw the UML diagram and implement the new
		 * GeometricObject class. Write a test program that uses the max method
		 * to find the larger of two circles and the larger of two rectangles.
		 */

		Circle circle1 = new Circle(20, "red", true);
		Circle circle2 = new Circle(10, "blue", false);

		// Display circle1
		System.out.println("\nCircle 1: ");
		print(circle1);

		// Display circle2
		System.out.println("\nCircle 2: ");
		print(circle2);

		// Display larger circle
		print("\nThe larger of the two circles was ");
		print(Circle.max(circle1, circle2));

		// Create two Rectangle objects
		Rectangle rectangle1 = new Rectangle(4, 7, "green", true);
		Rectangle rectangle2 = new Rectangle(6, 6, "orange", true);

		// Display circle1
		System.out.println("\nRectangle 1: ");
		print(circle1);

		// Display circle2
		System.out.println("\nRectangle 2: ");
		print(circle2);

		// Display larger circle
		print("\nThe larger of the two rectangles was ");
		print(Rectangle.max(rectangle1, rectangle2));
	}

	// Displays a string
	public static void print(String s) {
		System.out.println(s);
	}

	// Displays a GeometricObject
	public static void print(GeometricObject o) {
		System.out.println(o);

	}

}
