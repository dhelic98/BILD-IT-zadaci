package zadaci_03_03_2017;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * The MyPoint class) Design a class named MyPoint to represent a point
		 * with x- and y-coordinates. The class contains: ■ The data fields x
		 * and y that represent the coordinates with getter methods. ■ A no-arg
		 * constructor that creates a point (0, 0). ■ A constructor that
		 * constructs a point with specified coordinates. ■ A method named
		 * distance that returns the distance from this point to a specified
		 * point of the MyPoint type. ■ A method named distance that returns the
		 * distance from this point to another point with specified x- and
		 * y-coordinates. Draw the UML diagram for the class and then implement
		 * the class. Write a test program that creates the two points (0, 0)
		 * and (10, 30.5) and displays the distance between them.
		 */
		// Creating objects
		MyPoint myp1 = new MyPoint();
		MyPoint myp2 = new MyPoint(10, 30.5);
		// Printing out result
		System.out.println(myp1.distance() + " is distance between x and y");
		System.out.println("Distance between to lines(x1,y1 and x2,y2) is "
				+ myp1.distance(11, -3));

	}

}
