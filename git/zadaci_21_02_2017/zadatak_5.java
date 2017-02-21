package zadaci_21_02_2017;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Pretpostavimo da kupujemo rižu ili neki drugi proizvod u dva
		 * različita pakovanja. Želimo napisati program koji upoređuje cijene ta
		 * dva pakovanja. Program pita korisnika da unese težinu i cijenu oba
		 * pakovanja te ispisuje koje pakovanje ima bolju cijenu.
		 */

		Scanner uInput = new Scanner(System.in);
		// Callimg methods for input by user
		double price1 = methods.User_Input.positiveDoubleInput(uInput,
				"Enter the price of first product");
		int weight1 = methods.User_Input.positiveIntInput(uInput,
				"Enter the weigth of first product in grams");
		double price2 = methods.User_Input.positiveDoubleInput(uInput,
				"Enter the price of first product");
		int weight2 = methods.User_Input.positiveIntInput(uInput,
				"Enter the weigth of first product");
		// calcualting price to weight ratio
		double price_to_w_ratio1 = price1 / weight1;

		double price_to_w_ratio2 = price2 / weight2;

		// condition for printing out the result
		if (price_to_w_ratio1 < price_to_w_ratio2) {
			System.out.print("First product has better deal. ");

		} else if (price_to_w_ratio1 == price_to_w_ratio2) {
			System.out.println("Both deals are the same");

		} else {
			System.out.println("Second product has better deal");
		}

	}

}
