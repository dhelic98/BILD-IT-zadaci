package zadaci_09_03_2017;

import java.util.Random;
import java.util.Scanner;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (ArrayIndexOutOfBoundsException) Write a program that meets the
		 * following requirements: ■ Creates an array with 100 randomly chosen
		 * integers. ■ Prompts the user to enter the index of the array, then
		 * displays the corresponding element value. If the specified index is
		 * out of bounds, display the message Out of Bounds.
		 */
		Scanner uInput = new Scanner(System.in);
		Random rand = new Random();

		// Initializing array and generating 100 random ints
		int[] m = new int[100];
		for (int i = 0; i < m.length; i++) {
			m[i] = rand.nextInt(100);

		}
		do {
			try {
				// Input by user
				System.out.println("Enter index of array");
				int index = uInput.nextInt();
				// Printing out result
				System.out.println("Number at index " + index + " is "
						+ m[index]);
				break;
			} catch (IndexOutOfBoundsException ex) {
				System.out.println("Out of bounds");
				uInput.nextLine();
			} catch (Exception e) {
				System.out.println("Exception");
				uInput.nextLine();
			}
		} while (true);
		uInput.close();
	}
}
