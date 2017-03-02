package zadaci_02_03_2017;

public class Fan {
	// Constants
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	// private data field
	private int speed;
	private boolean on;
	private double radius;
	private String colour;

	public Fan() {
		this.on = false;
		this.radius = 5;
		this.colour = "blue";
		this.speed = SLOW;
	}

	// Generating getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;

	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		if (this.on == true) {
			return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius
					+ ", colour=" + colour + "]";
		} else {
			return "Fan is currently off, colour is " + this.colour
					+ " radius is " + this.radius
					+ " and his speed when on is " + this.speed;
		}
	}

}
