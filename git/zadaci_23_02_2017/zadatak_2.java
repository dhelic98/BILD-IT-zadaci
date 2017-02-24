package zadaci_23_02_2017;

import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji pita korisnika da unese neki string te mu
		 * ispisuje dužinu tog stringa kao i prvo slovo stringa.
		 */
		Scanner uInput = new Scanner(System.in);

		while (true) {
			try {
				// Input by user
				System.out.println("Please enter string");
				String input = uInput.nextLine();

				int index = getFirstLetterIndex(input);

				if (index == -1) {
					System.out.println("Lenght is " + input.length()
							+ " and there are no letters");
				} else {

					// Printing out the result
					System.out.println("Lenght of string is " + input.length()
							+ " and first letter is \"" + input.charAt(index)
							+ "\" and his index is " + index);
				}
				break;
			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}
		}
		uInput.close();
	}

	public static int getFirstLetterIndex(String input) {
		// Method that finds index of first letter
		int index = -1;
		for (int i = 0; i < input.length(); i++) {

			if (Character.isLetter(input.charAt(i))) {
				index = i;
				break;
			}

		}
		return index;
	}

}
