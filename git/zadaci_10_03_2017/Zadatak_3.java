package zadaci_10_03_2017;

import java.io.File;

import java.io.PrintWriter;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak_3 {

	public static void main(String[] args) throws Exception {
		/*
		 * (Remove text) Write a program that removes all the occurrences of a
		 * specified string from a text file. For example, invoking java
		 * Exercise12_11 John filename removes the string John from the
		 * specified file. Your program should get the arguments from the
		 * command line.
		 */

		//Condition for running programm
		if (args.length != 2) {
			System.out.println("Usage: java RemoveText filename");
			System.exit(1);
		}
		//Initializing file
		File file = new File(args[1]);
		if (!file.exists()) {
			System.out.println("File " + args[1] + " does not exist");
			System.exit(2);
		}

		//Initializing arrayList
		ArrayList<String> string = new ArrayList<>();
		try (Scanner input = new Scanner(file);) {

			while (input.hasNext()) {
				String line = input.nextLine();
				string.add(removeString(args[0], line));
			}

		}
		try (
		// Create output file
		PrintWriter output = new PrintWriter(file);) {
			for (int i = 0; i < string.size(); i++) {
				output.println(string.get(i));
			}
		}

	}

	private static String removeString(String string, String line) {
		//Method that removes regex from line
		line = line.replaceAll(string, "");
		return line;
	}

}
