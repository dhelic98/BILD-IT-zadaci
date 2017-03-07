package zadaci_07_03_2017;

public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;

	public Triangle() {
		// No args constructor
		this.side1 = 0;
		this.side2 = 0;
		this.side3 = 0;
	}

	Triangle(double side1, double side2, double side3) {
		// COnstrucotr for sides input by user
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

	}

	
	//Accessor methods
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}

	//Returning perimiter of triangle
	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	//method for finding area of triangle
	public double getArea() {
		double p = getPerimeter() / 2;
		return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
	}

	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
				+ side3;

	}

}
