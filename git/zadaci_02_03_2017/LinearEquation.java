package zadaci_02_03_2017;

public class LinearEquation {
	/*
	 * (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for
	 * a 2 * 2 system of linear equations: ax + by = e cx + dy = f x = ed - bf
	 * ad - bc y = af - ec ad - bc The class contains: ■ Private data fields a,
	 * b, c, d, e, and f. ■ A constructor with the arguments for a, b, c, d, e,
	 * and f. ■ Six getter methods for a, b, c, d, e, and f. ■ A method named
	 * isSolvable() that returns true if ad - bc is not 0. ■ Methods getX() and
	 * getY() that return the solution for the equation.
	 */

	// private data field
	private double a, b, c, d, e, f;

	public LinearEquation(double a, double b, double c, double d, double e,
			double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	// getters and setters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public boolean isSolvable() {
		if ((this.a * this.d) - (this.b * this.c) != 0) {
			return true;
		}

		return false;
	}

	public double getX() {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY() {
		return (a * f - e * c) / (a * d - b * c);

	}
}
