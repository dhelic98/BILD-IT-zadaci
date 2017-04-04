package zadaci_04_04_2017;

import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) {
		/*
		 * finds the number of occurrences of a specified letter in a string
		 * using the following method header: public static int count(String
		 * str, char a) For example, count("Welcome", 'e') returns 2. Write a
		 * test program that prompts the user to enter a string and a character,
		 * and displays the number of occurrences for the character in the
		 * string.
		 */

		Scanner uInput = new Scanner(System.in);
		// Input by user
		System.out.println("Enter string");
		String string = uInput.nextLine();
		System.out.println("Enter character you want to count");
		char c = uInput.nextLine().charAt(0);

		// Display the number of occurences for the character in the string
		System.out.println("In word " + string + " char " + c + " has occured "
				+ count(string, c) + " times");
	}

	public static int count(String str, char a) {
		int index = 0;
		int count = 0;
		return count(str, a, index, count);
	}

	/** Helpler count method */
	private static int count(String str, char a, int i, int count) {
		if (i == str.length())
			return count;
		else if (str.charAt(i) == a)
			return count(str, a, ++i, ++count);
		else
			return count(str, a, ++i, count);
	}

}
