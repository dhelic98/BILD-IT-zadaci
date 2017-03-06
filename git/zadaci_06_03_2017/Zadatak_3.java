package zadaci_06_03_2017;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * (Implement the Character class) The Character class is provided in
		 * the Java library. Provide your own implementation for this class.
		 * Name the new class MyCharacter.
		 */
		// Creating object
		MyCharacter ch1 = new MyCharacter(69);
		MyCharacter ch2 = new MyCharacter(109);
		MyCharacter ch3 = new MyCharacter(98);

		// Testing methods
		System.out.println(ch1.charValue());
		System.out.println(ch1.compareTo('c'));
		System.out.println(MyCharacter.toLowerCase('B'));
		System.out.println(MyCharacter.compare('a', 'r'));

	}

}
