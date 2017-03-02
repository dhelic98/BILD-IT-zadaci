package zadaci_02_03_2017;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Draw the UML diagram for the class and then implement the class.
		 * Write a test program that creates three RegularPolygon objects,
		 * created using the no-arg constructor, using RegularPolygon(6, 4), and
		 * using RegularPolygon(10, 4, 5.6, 7.8). For each object, display its
		 * perimeter and area. VideoNote The Fan class
		 */
		// Creating objects
		RegularPolygon poly1 = new RegularPolygon();
		RegularPolygon poly2 = new RegularPolygon(6, 4);
		RegularPolygon poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
		// Printing out results
		System.out.print(poly1.toString() + "Area is: ");
		System.out.printf("%4.2f", poly1.getArea());

		System.out.print("]\n" + poly2.toString() + "Area is: ");
		System.out.printf("%4.2f", poly2.getArea());

		System.out.print("]\n" + poly3.toString() + "Area is: ");
		System.out.printf("%4.2f", poly3.getArea());
		System.out.print("]");

	}

}
