package zadaci_06_03_2017;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * **10.22 (Implement the String class) The String class is provided in
		 * the Java library. Provide your own implementation for the following
		 * methods (name the new class MyString1): public MyString1(char[]
		 * chars); public char charAt(int index); public int length(); public
		 * MyString1 substring(int begin, int end); public MyString1
		 * toLowerCase(); public boolean equals(MyString1 s); public static
		 * MyString1 valueOf(int i);
		 */
		// Initializing char arrays for creating MyString1 objects
		char[] chars = { 'a', 'A', 'H', 'K', '1', '.' };
		char[] chars2 = { 'a', 'A', 'H', 'K', '1', '.', 'h', '1', '4', '6', '0' };

		// Creating objects
		MyString1 myS1 = new MyString1(chars);
		MyString1 mys2 = new MyString1(chars2);
		MyString1 mys3=new MyString1(chars);

		// Calling and testing methods
		System.out.println(myS1.charAt(2));
		System.out.println(myS1.length());
		MyString1 mys1lower = myS1.toLowerCase();
		mys1lower.MyStringPrint();

		System.out.println(myS1.equals(mys2));
		MyString1.valueOf(1323232L).MyStringPrint();
		System.out.println(myS1.equals(mys3));
	}
}
