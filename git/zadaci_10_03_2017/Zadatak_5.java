package zadaci_10_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Zadatak_5 {

	public static void main(String[] args) throws IOException {
		/*
		 * (Process scores in a text file) Suppose that a text file contains an
		 * unspecified number of scores separated by blanks. Write a program
		 * that prompts the user to enter the file, reads the scores from the
		 * file, and displays their total and average.
		 */
		// Initializing arrayList and loading it from file
		ArrayList<Double> scores = new ArrayList<>();
		readingFromFile(scores);
		// variable for sum
		double sum = 0;

		// Loop that sums up values from arrayList
		for (int i = 0; i < scores.size(); i++) {
			sum += scores.get(i);

		}
		double average = sum / scores.size();
		// Printing out
		System.out.println("Sum of scores is " + sum + "\nAnd average is "
				+ average);

	}

	public static void readingFromFile(ArrayList<Double> scores)
			throws IOException {
		// Method for reading from file

		Path path = Paths.get("scores.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}
		BufferedReader reader = Files.newBufferedReader(path);
		String line = "";
		while ((line = reader.readLine()) != null) {
			String[] scoresLine = line.split(" ");
			for (int i = 0; i < scoresLine.length; i++) {
				scores.add(Double.parseDouble(scoresLine[i]));

			}

		}
		reader.close();

	}

}
