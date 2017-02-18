package zadaci_17_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati metodu koja pronalazi broj ponavljanja određenog
		 * karaktera u stringu. Metoda treba da koristi sljedeći header: public
		 * static int count(String str, char a). Na primjer, ukoliko pozovemo
		 * metodu na sljedeći način: count("Welcome", e) metoda treba da vrati
		 * 2. Napisati program koji pita korisnika da unese string i koji
		 * karakter želi da prebroji u datom stringu te mu ispiše koliko se puta
		 * određeni karakter ponovio u zadatom stringu.
		 */

		Scanner uInput = new Scanner(System.in);
		do {
			try {
				// User string input
				System.out.println("Please input string");
				String stringInput = uInput.nextLine();
				// condition for string input
				while ((stringInput.equals("")) || (stringInput.equals(" ") )) {
					System.out.println("Enter string please");
					stringInput = uInput.nextLine();
				}
//User char input
				System.out
						.println("Please enter character that you want to count");
				char c = uInput.next().charAt(0);
//Printing out the result
				System.out.println("In your string character \'" + c
						+ "\' has been repeated " + count(stringInput, c));
				break;

			} catch (InputMismatchException ex) {

				System.out.println("There was an input exception");
				uInput.nextLine();
			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);
		uInput.close();
	}

	public static int count(String str, char a) {
		//Method that counts how many times certain char has been repeated
		int charCounter = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == a) {
				charCounter++;

			}
		}
		return charCounter;
	}

}
