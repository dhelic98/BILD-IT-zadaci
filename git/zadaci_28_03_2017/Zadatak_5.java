package zadaci_11_03_2017;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Zadatak_5 {

	public static void main(String[] args) throws IOException {
		/*
		 * (Create large dataset) Create a data file with 1,000 lines. Each line
		 * in the file consists of a faculty member’s first name, last name,
		 * rank, and salary. The faculty member’s first name and last name for
		 * the ith line are FirstNamei and LastNamei. The rank is randomly
		 * generated as assistant, associate, and full. The salary is randomly
		 * generated as a number with two digits after the decimal point. The
		 * salary for an assistant professor should be in the range from 50,000
		 * to 80,000, for associate professor from 60,000 to 110,000, and for
		 * full professor from 75,000 to 130,000. Save the file in Salary.txt.
		 * Here are some sample data: FirstName1 LastName1 assistant 60055.95
		 * FirstName2 LastName2 associate 81112.45 . . . FirstName1000
		 * LastName1000 full 92255.21
		 */
		// Initializing random from .util
		Random rand = new Random();

		// Initializing path and creating it if it does not exist
		Path path = Paths.get("Salary.txt");
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		// Initializing writer
		BufferedWriter writer = Files.newBufferedWriter(path);

		// loop that tracks writing
		for (int i = 0; i < 1000; i++) {
			int rank = rand.nextInt(3);
			int salary = 0;
			if (rank == 0) {
				salary = (int) ((Math.random() * 30000) + 50000);

			} else if (rank == 1) {
				salary = (int) ((Math.random() * 50000) + 60000);

			} else if (rank == 2) {
				salary = (int) ((Math.random() * 55000) + 75000);
			}

			try {
				writer.write("FirstName" + (i + 1) + " LastName" + (i + 1));
				if (rank == 0) {
					writer.write(" assistant professor ");
				} else if (rank == 1) {
					writer.write(" associate professor ");
				} else if (rank == 2) {
					writer.write(" full ");

				}
				writer.write(salary + ".00");
				writer.newLine();

			} catch (Exception ex) {
				System.out.println("Exception");
			}

		}
		// closing writer
		writer.close();
	}

}
