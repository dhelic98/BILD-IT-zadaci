package zadaci_09_03_2017;

import java.util.ArrayList;
import java.util.Scanner;
import zadaci_03_03_2017.MyPoint;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * (Area of a convex polygon) A polygon is convex if it contains any
		 * line segments that connects two points of the polygon. Write a
		 * program that prompts the user to enter the number of points in a
		 * convex polygon, then enter the points clockwise, and display the area
		 * of the polygon.
		 */

		// Initializing arrayList and scanner
		Scanner uInput = new Scanner(System.in);
		ArrayList<MyPoint> points = new ArrayList<>();

		while (true) {
			// Input by user
			int numberOfSides = methods.User_Input.positiveIntInput(uInput,
					"Enter number of sides");
			if (numberOfSides < 4) {
				continue;
			}

			for (int i = 0; i < numberOfSides; i++) {
				System.out.println("Enter point " + (i + 1));
				double x = methods.User_Input.positiveDoubleInput(uInput,
						"Enter x:");
				double y = methods.User_Input.positiveDoubleInput(uInput,
						"Enter y:");

				MyPoint point = new MyPoint(x, y);

				points.add(point);
			}
			// calling method
			double areaOfPolygon = getArea(points);
			// Printing out result
			System.out.println("Area of input polygon is " + areaOfPolygon);
			break;
		}
		uInput.close();

	}

	public static double getArea(ArrayList<MyPoint> points) {
		// Method that returns area
		double area = 0;
		double sum1 = 0;
		double sum2 = 0;

		for (int i = 0; i < points.size() - 1; i++) {
			MyPoint point1 = points.get(i);
			MyPoint point2 = points.get(i + 1);

			sum1 += (point1.getX() * point2.getY() - point1.getY()
					* point2.getX());
		}

		MyPoint lastPoint = points.get(points.size() - 1);
		MyPoint firstPoint = points.get(0);

		sum2 += (lastPoint.getX() * firstPoint.getY() - lastPoint.getY()
				* firstPoint.getX());

		area = Math.abs((sum1 + sum2) / 2);

		return area;
	}

}
