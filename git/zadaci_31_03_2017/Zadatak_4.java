package zadaci_15_03_2017;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Sum the areas of geometric objects) Write a method that sums the
		 * areas of all the geometric objects in an array. The method signature
		 * is: public static double sumArea(GeometricObject[] a) Write a test
		 * program that creates an array of four objects (two circles and two
		 * rectangles) and computes their total area using the sumArea method.
		 */

		// Create an array of four objects
		GeometricObject[] array = { new Circle(6), new Circle(5.6),
				new Rectangle(3, 4), new Rectangle(4, 2) };

		// Display results
		System.out.print("Area of elements in array: ");
		System.out.printf("%4.2f", sumArea(array));
		System.out.print(" square centimeters.\n");

	}

	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i].getArea();

		}

		return sum;
	}

}
