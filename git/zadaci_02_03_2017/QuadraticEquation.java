package zadaci_02_03_2017;

public class QuadraticEquation {
	/*
	 * (Algebra: quadratic equations) Design a class named QuadraticEquation for
	 * a quadratic equation ax2 + bx + x = 0. The class contains: ■ Private data
	 * fields a, b, and c that represent three coefficients. ■ A constructor for
	 * the arguments for a, b, and c. ■ Three getter methods for a, b, and c. ■
	 * A method named getDiscriminant() that returns the discriminant, which is
	 * b2 - 4ac. ■ The methods named getRoot1() and getRoot2() for returning two
	 * roots of the equation r1 = -b + 2b2 - 4ac 2a and r2 = -b - 2b2 - 4ac 2a
	 * These methods are useful only if the discriminant is nonnegative. Let
	 * these methods return 0 if the discriminant is negative.
	 */
	// Private data fields
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		// Constructor
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// Generating getters and setters
	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminant() {
		return (b * b - 4 * a * c);
	}

	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		double disc = getDiscriminant();
		return ((Math.sqrt(disc) / 2 * a) + (-b / 2 * a));
	}

	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		double disc = getDiscriminant();
		return ((Math.sqrt(disc) / 2 * a) - (-b / 2 * a));
	}

}
