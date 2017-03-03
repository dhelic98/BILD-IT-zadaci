package zadaci_03_03_2017;

public class MyPoint {
	// data field
	private double x;
	private double y;

	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}

	MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	// Getters
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distance() {
		return distance(this.x, this.y);

	}

	public double distance(double x, double y) {
		return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y)
				* (this.y - y));

	}
}
