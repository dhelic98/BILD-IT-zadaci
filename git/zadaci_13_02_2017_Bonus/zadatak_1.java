package zadaci_13_02_2017_Bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Napisati jednostavni konzolni kalkulator. Kalkulator treba da
		 * podržava sljedeće operacije:
		 * 
		 * Sabiranje Oduzimanje Množenje Djeljenje Korjenovanje (opcionalno)
		 * Kvadriranje (opcionalno) Modulo (opcionalno)
		 * 
		 * Znate kako kalkulatori rade - nema se tu šta objašnjavati.
		 */

		Scanner uInput = new Scanner(System.in);

		while (true) {
			try {
				//Pozivamo metodu koja printa glavni meni
				printMenu();
				//Unos opcije od strane korisnika
				int userOption = uInput.nextInt();
				//Petljom provjeravamo unos korisnika
				while (userOption != 0) {
					if (userOption == 1) {
						//Pozivamo sabiranje
						addition();
						break;
					} else if (userOption == 2) {
						//Pozivamo metodu za oduzimanje
						substraction();
						
						break;

					} else if (userOption == 3) {
						//Pozive metode za mnozenje
						multiplying();
						
						break;

					} else if (userOption == 4) {
						//Poziv metode za djeljenje
						division();
						
						break;
					} else if (userOption == 5) {
						//Pozive metode za korijen
						root();
						
						break;
					} else if (userOption == 6) {
						//Pozive metode za kvadriranje
						exponentials();
						
						break;

					} else if (userOption == 7) {
						//Poziv metode za modulo
						modulo();
						
						break;

					}

					else {
						break;
					}

				}
				if (userOption == 0) {
					//ako je unos 0 prekidamo program
					break;
				}
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();

			} catch (Exception ex) {
				System.out.println("Exception in code");
				uInput.nextLine();
			}
		}

	}

	public static void printMenu() {
		//Medota koja printa glavni meni
		System.out.println("--------------");
		System.out.println("Calcualtor app");
		System.out.println("--------------");
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplying");
		System.out.println("4.Division");
		System.out.println("5.Get root");
		System.out.println("6.Exponentials");
		System.out.println("7.Modulo");
		System.out.println("0.Exit");
		System.out.println("--------------");
	}

	public static void addition() {
		//Sabrianje
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter numbers for addition");
				double number1 = uInput.nextDouble();
				double number2 = uInput.nextDouble();
				double result = number1 + number2;
				System.out.println(number1 + " + " + number2 + "= " + result);
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			}
		} while (true);

	}

	public static void substraction() {
		//Oduzimanje 
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter numbers for substraction");
				double number1 = uInput.nextDouble();
				double number2 = uInput.nextDouble();
				double result = number1 - number2;
				System.out.println(number1 + " - " + number2 + "= " + result);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			} catch (Exception e) {
				System.out.println("Wrong");
				uInput.nextLine();
			}

		} while (true);

	}

	public static void multiplying() {
		//Mnozenje
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter numbers for multiplying");
				double number1 = uInput.nextDouble();
				double number2 = uInput.nextDouble();
				double result = number1 * number2;
				System.out.println(number1 + " * " + number2 + "= " + result);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			} catch (Exception ex) {
				System.out.println("Wrong");
				uInput.nextLine();
			}

		} while (true);

	}

	public static void division() {
		//Djeljenje
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter numbers for division");
				double number1 = uInput.nextDouble();
				double number2 = uInput.nextDouble();
				double result = number1 / number2;
				System.out.println(number1 + " / " + number2 + "= " + result);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			} catch (Exception ex) {
				System.out.println("Wrong");
				uInput.nextLine();
			}

		} while (true);

	}

	public static void root() {
		//Korijen
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter number for finding root");
				double number1 = Math.abs(uInput.nextDouble());

				double result = Math.sqrt(number1);
				System.out.println("Square root of number " + number1 + " is "
						+ result);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			} catch (Exception ex) {
				System.out.println("Wrong");
				uInput.nextLine();
			}

		} while (true);
	}

	public static void exponentials() {
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter numbers for exponentials");
				double number1 = uInput.nextDouble();
				double number2 = uInput.nextDouble();
				double result = Math.pow(number1, number2);
				System.out.println(number1 + " .e " + number2 + "= " + result);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			} catch (Exception ex) {
				System.out.println("Wrong");
				uInput.nextLine();
			}

		} while (true);

	}

	public static void modulo() {
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				System.out.println("Enter numbers for modulo");
				double number1 = uInput.nextDouble();
				double number2 = uInput.nextDouble();
				double result = number1 % number2;
				System.out.println(number1 + " % " + number2 + "= " + result);
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			} catch (Exception ex) {
				System.out.println("Error");
				uInput.nextLine();

			}

		} while (true);

	}

}
