package zadaci_06_03_2017;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (Implement the String class) The String class is provided in the Java
		 * library. Provide your own implementation for the following methods
		 * (name the new class MyString2): public MyString2(String s); public
		 * int compare(String s); public MyString2 substring(int begin); public
		 * MyString2 toUpperCase(); public char[] toChars(); public static
		 * MyString2 valueOf(boolean b);
		 */
		// Creating object
		MyString2 my1 = new MyString2("hazim");
		MyString2 my2 = new MyString2("haazim");
		MyString2 my3 = new MyString2("radno");

		// Testing methods
		System.out.println(my1.compare(my2.toString()));
		System.out.println(my2.toChars());
		System.out.println(my3.substring(1));
		System.out.println(my2.toUpperCase());

	}

}
