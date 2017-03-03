package zadaci_03_03_2017;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Draw the UML diagram for the class and then implement the class.
		 * Write a client program that tests all methods in the class.
		 */
		// Creating objects and testing methods from MyInteger class
		MyInteger myInt = new MyInteger(7);
		System.out.println("Is even " + myInt.isEven());
		System.out.println("Is odd " + myInt.isOdd());
		System.out.println("Is prime " + myInt.isPrime());
		// Printing out results of static methods
		System.out.println("Is 15 prime " + MyInteger.isPrime(15) + " is odd "
				+ MyInteger.isOdd(15) + " is even " + MyInteger.isEven(15));
		// Using parse int
		char[] chars = { '4', '2', '0', '9' };
		System.out.println(MyInteger.parseInt(chars));
		String s = "993232";
		System.out.println(MyInteger.parseInt(s));

		MyInteger n2 = new MyInteger(24);
		System.out.println("n2 is odd? " + n2.isOdd());
		System.out.println("45 is odd? " + MyInteger.isOdd(45));
		System.out.println("n1 is equal to n2? " + myInt.equals(n2));
		System.out.println("n1 is equal to 5? " + myInt.equals(5));

	}

}
