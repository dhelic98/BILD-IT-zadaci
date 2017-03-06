package zadaci_06_03_2017;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * (Implement the StringBuilder class) The StringBuilder class is
		 * provided in the Java library. Provide your own implementation for the
		 * following methods (name the new class MyStringBuilder1): -public
		 * MyStringBuilder1(String s); -public MyStringBuilder1
		 * append(MyStringBuilder1 s); -public MyStringBuilder1 append(int i);
		 * -public int length(); -public char charAt(int index); -public
		 * MyStringBuilder1 toLowerCase(); -public MyStringBuilder1
		 * substring(int begin, int end); -public String toString();
		 */

		// Creating objects
		MyStringBuilder1 mysb1 = new MyStringBuilder1("Ja SSam");
		MyStringBuilder1 mysb2 = new MyStringBuilder1(" uvijek umoran");

		// Testing object methods
		System.out.println(mysb1.append(873));
		System.out.println(mysb1.append(mysb2));
		System.out.println(mysb2.length());
		System.out.println(mysb2.charAt(2));
		System.out.println(mysb1.toLowerCase());
		System.out.println(mysb1.append(mysb2).substring(3, 10));

	}

}
