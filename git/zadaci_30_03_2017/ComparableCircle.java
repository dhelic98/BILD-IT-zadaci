package zadaci_14_03_2017;

public class ComparableCircle extends Circle {
	public ComparableCircle() {
	}

	/** Construct a CoparableCircle with specified radius */
	public ComparableCircle(double radius) {
		super(radius);
	}

	/** Construct a CoparableCircle with specified properties */
	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}

	public int compareTo(ComparableCircle o) {
		return super.compareTo(o);

	}

	@Override
	// Implement the toString method defined in Circle
	public String toString() {
		return super.toString() + "\nArea: " + getArea();
	}

}
