package zadaci_13_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Pretpostavimo da uplatimo $100 svaki mjesec na štedni račun koji
		 * ima godišnju interesnu stopu od 5%. Mjesečna interesna stopa je stoga
		 * 0.05 / 12 = 0.00417. Nakon prvog mjeseca vrijednost na računu postaje
		 * 100 * (1 + 0.00417) = 100.417. Nakon drugog mjeseca, vrijednost na
		 * računu postaje (100 + 100.417) * (1 + 0.00417) = 201.252. Nakon
		 * trećeg mjeseca, vrijednost na računu postaje (100 + 201.252) * (1 +
		 * 0.00417) = 302.507 i tako dalje. Napisati program koji pita korisnika
		 * da unese mjesečni iznos štednje te broj mjeseci nakon kojeg bi želio
		 * znati stanje računa.
		 */

		Scanner uInput = new Scanner(System.in);
		do {
			try {
				// Unos kolicine novca od strane korisnika
				System.out
						.println("Enter the amount of money you want to put in the bank monthly?");
				double amountForSavings = uInput.nextDouble();
				// Uslov za unos
				while (amountForSavings <= 0) {
					System.out
							.println("You have to insert positive amount of money");
					amountForSavings = uInput.nextDouble();
				}
				// Unos broja mjeseci
				System.out.println("Enter number of months");
				int months = uInput.nextInt();
				// Uslov za unos mjeseci
				while (months < 1) {
					System.out
							.println("Your input is wrong please enter number of months again");
					months = uInput.nextInt();

				}
				// Pozvianje metode
				double accountInfo = increase(amountForSavings, months);
				// Printanje
				System.out.println("Your account will have: $" + accountInfo
						+ " in " + months + " months");
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Your input is wrong try again");
			}
		} while (true);

	}

	public static double increase(double amount, int numberOfMonths) {
		// Metoda koja racuna stanje na racunu nakon odredjenog broja mjeseci
		double increase = (1 + 0.00417);
		double sum = 0;
		for (int i = 1; i <= numberOfMonths; i++) {
			sum = (sum + amount) * increase;
		}
		return sum;
	}
}
