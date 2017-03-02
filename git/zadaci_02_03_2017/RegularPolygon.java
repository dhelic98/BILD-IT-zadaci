package zadaci_02_03_2017;

public class RegularPolygon {
	// data fields
	private int n;
	private double side;
	private double x;
	private double y;

	public RegularPolygon() {
		// No args constructor and setting default values
		n = 3;
		side = 1;
		x = 0;
		y = 1;
	}

	// Generating getters and setters
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	RegularPolygon(int n, double side) {
		// Const. that creates centered polygon
		this.n = n;
		this.side = side;
		x = 0;
		y = 0;

	}

	RegularPolygon(int n, double side, double x, double y) {

		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}

	public double getPerimeter() {
		return n * side;
	}

	public double getArea() {
		return (n * (side * side)) / 4 * Math.tan(Math.PI / n);
	}

	@Override
	public String toString() {
		return "RegularPolygon [n=" + n + ", side=" + side + ", x=" + x
				+ ", y=" + y + ", Perimeter=" + getPerimeter();
	}

}
