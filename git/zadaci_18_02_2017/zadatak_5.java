package zadaci_18_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Napisati program koji učitava neodređen broj cijelih brojeva,
		 * određuje koliko je pozitivnih brojeva korisnik unijeo, koliko
		 * negativnih te izračunava ukupnu sumu i prosjek svih unesenih brojeva.
		 * (Korisnik prekida unos tako što unese nulu). Na primjer, ukoliko
		 * korisnik unese 1 2 -1 3 0 program treba da ispiše da je broj
		 * pozitivnih brojeva 3, negativnih brojeva 1, suma ili zbir su 5.0 a
		 * prosjek svih brojeva je 1.25.
		 */
		Scanner uInput = new Scanner(System.in);

		do {
			try {
//initializing variable that holds user inputed numbers
				int number = 1;
//sum
				int sum = 0;

				int inputCounter = 0;
				int positiveCounter = 0;
				int negativeCounter = 0;

				while (true) {
					// user input
					System.out.println("Enter whole number .0 stops input");
					number = uInput.nextInt();
					if (number == 0) {
						break;
					} else {
						sum += number;
						inputCounter++;
						if (number > 0) {
							positiveCounter++;
						} else if (number < 0) {
							negativeCounter++;
						}
					}
				}
				
				//calculating average
				double average = (double)sum / inputCounter;
				
				
				//Printing out the result
				System.out.print("Number of positive number is "
						+ positiveCounter + ", negative " + negativeCounter
						+ " sum of all numbers is "+ sum + " and average is ");
				System.out.printf("%4.2f",average);
						
				break;
			} catch (InputMismatchException ex) {
				System.out.println("There was an input exception");
				uInput.nextLine();
			} catch (Exception e) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);
		// closing scanner
		uInput.close();

	}

}
