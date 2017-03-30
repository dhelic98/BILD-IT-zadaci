package zadaci_13_03_2017;

import java.util.*;
import java.net.*;

public class Zadatak_3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * (Baby name popularity ranking) The popularity ranking of baby names
		 * from years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames
		 * and stored in files named babynameranking2001.txt,
		 * babynameranking2002.txt, . . . , babynameranking2010.txt. Each file
		 * contains one thousand lines. Each line contains a ranking, a boy’s
		 * name, number for the boy’s name, a girl’s name, and number for the
		 * girl’s name. For example, the first two lines in the file
		 * babynameranking2010.txt are as follows: So, the boy’s name Jacob and
		 * girl’s name Isabella are ranked #1 and the boy’s name Ethan and
		 * girl’s name Sophia are ranked #2. 21,875 boys are named Jacob and
		 * 22,731 girls are named Isabella. Write a program that prompts the
		 * user to enter the year, gender, and followed by a name, and displays
		 * the ranking of the name for the year. Here is a sample run:
		 */

		Scanner uInput = new Scanner(System.in);

		// Prompt the user to enter the year, gender and name
		System.out.print("Enter the year: ");
		String year = uInput.nextLine();

		System.out.print("Enter the gender: ");
		String gender = uInput.nextLine();

		System.out.print("Enter the name: ");
		String name = uInput.nextLine();

		// Create an ArrayList
		ArrayList<String> list = new ArrayList<>();

		// Read text from url
		try {
			URL url = new URL(
					"http://www.cs.armstrong.edu/liang/data/babynamesranking"
							+ year + ".txt");

			// Create input file from url
			uInput = new Scanner(url.openStream());
			while (uInput.hasNext()) {
				for (int i = 0; i < 5; i++) {
					list.add(i, uInput.next());
				}

				// Display ranking for the name for the year
				if (list.get(gender(gender)).equals(name)) {
					System.out.println(name + " is ranked #" + list.get(0)
							+ " in year " + year);
					System.exit(0);
				}
				list.clear();
			}
		} catch (java.net.MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (java.io.IOException ex) {
			System.out.println("I/O Errors: no such file");
		} catch (Exception e) {
			System.out.println("Exception");
		}

		System.out.println("The name " + name + " is not ranked in year "
				+ year);

		uInput.close();
	}

	/** Returns the index for the corresponding gender */
	public static int gender(String gender) {
		if (gender.equals("M"))
			return 1;
		else
			return 3;
	}

}
