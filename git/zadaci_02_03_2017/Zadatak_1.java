package zadaci_02_03_2017;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Draw the UML diagram for the class and then implement the class.
		 * Write a test program that creates two Fan objects. Assign maximum
		 * speed, radius 10, color yellow, and turn it on to the first object.
		 * Assign medium speed, radius 5, color blue, and turn it off to the
		 * second object. Display the objects by invoking their toString method.
		 */

		// Initializing fans
		Fan fan = new Fan();
		Fan fan2 = new Fan();
		// Changing settings on fan 1
		fan.setSpeed(fan.FAST);
		fan.setRadius(10);
		fan.setColour("Yellow");
		fan.setOn(true);

		fan2.setSpeed(fan2.MEDIUM);
		// Printing out result
		System.out.println(fan.toString());
		System.out.println(fan2.toString());

	}

}
