package zadaci_13_03_2017;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Zadatak_2 {

	public static void main(String[] args) throws IOException {
		/*
		 * (Occurrences of each letter) Write a program that prompts the user to
		 * enter a file name and displays the occurrences of each letter in the
		 * file. Letters are case-insensitive.
		 */

		File file = new File(getFileName());

		// Check if file exists
		if (!file.exists()) {
			System.out.println("File " + file.getName() + " does not exist");
			System.exit(0);
		}

		// Initializing array for counting
		int[] count = new int[52];

		// reader
		BufferedReader reader = Files.newBufferedReader(file.toPath());

		String line = "";
		while ((line = reader.readLine()) != null) {
			countLetters(line, count);

		}

		// Printing out result
		for (int i = 0; i < 26; i++) {
			System.out.println("Number of " + (char) ('A' + i) + "\'s: "
					+ count[i]);

		}
		for (int i = 0; i < 26; i++) {
			System.out.println("Number of " + (char) ('a' + i) + "\'s: "
					+ count[i + 26]);

		}

	}

	public static String getFileName() {
		// Method for getting file name
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a filename: ");
		return input.next();
	}

	public static void countLetters(String line, int[] count) {
		// Method for counting letters
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) {
					count[(int) (c - 'A')]++;
				} else if (Character.isLowerCase(c)) {
					count[(int) (c - 'a' + 26)]++;
				}

			}
		}

	}

}
