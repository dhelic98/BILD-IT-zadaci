package zadaci_24_02_2017;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji prima ASCII kod (cijeli broj između 0 i 127)
		 * te ispisuje koji je to karakter. Na primjer, ukoliko korisnik unese
		 * 69 kao ASCII kod, program mu ispisuje da je karakter sa tim brojem
		 * karakter E.
		 */
		Scanner uInput = new Scanner(System.in);
		while (true) {
			// Calling method for input
			int input = methods.User_Input.positiveIntInput(uInput,
					"Enter number between 0 and 127");
			if (input > 127) {
				System.out.println("Wrong input");
				continue;
			}
			// converting int to char
			char converted = (char) input;
			// Printing out
			System.out.println("Your character is \'" + converted + "\'");
			break;
		}
		uInput.close();
	}

}
