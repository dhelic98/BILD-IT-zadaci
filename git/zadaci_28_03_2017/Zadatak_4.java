package zadaci_11_03_2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (Process scores in a text file on the Web) Suppose that the text file
		 * on the Web http://cs.armstrong.edu/liang/data/Scores.txt contains an
		 * unspecified number of scores. Write a program that reads the scores
		 * from the file and displays their total and average. Scores are
		 * separated by blanks.
		 */

		try {
			URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");

			double sum = 0;

			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));

			String line = "";
			int counter = 0;
			while ((line = in.readLine()) != null) {
				String[] numbers = line.split(" ");
				for (int i = 0; i < numbers.length; i++) {
					sum += Double.parseDouble(numbers[i]);
					counter++;

				}
			}

			double average = sum / counter;
			System.out.println("Sum is: " + sum + "\nAverage is: " + average);

		} catch (MalformedURLException ex) {
			System.out.println("URL exception");
		} catch (IOException e) {

			System.out.println("I/0 Errors: no such file");
		}

	}

}
