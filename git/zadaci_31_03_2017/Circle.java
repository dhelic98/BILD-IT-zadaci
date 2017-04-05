package zadaci_15_03_2017;

public class Circle extends GeometricObject implements Comparable<Circle>{
	
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	@Override
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}

	@Override
	/** Return String discription of Circle object */
	public String toString() {
		return super.toString() + "\nRadius: " + radius + "\nArea: "
				+ getArea() + "\nDiameter: " + getDiameter() + "\nPerimeter: "
				+ getPerimeter();
	}
	
	@Override
	// Implement the compareTo method defined in Comparable
	public int compareTo(Circle o) {
		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	@Override /** Return true if objects radii are the same */
	public boolean equals(Object o) {
		return this.compareTo((Circle)o) == 0;
	}


}