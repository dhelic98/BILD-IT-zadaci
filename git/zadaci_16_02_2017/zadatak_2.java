package zadaci_16_02_2017;

import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Great circle distance predstavlja udaljenost između dvije tačke na
		 * površine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku
		 * širinu i dužinu dvije tačke. Great circle distance između ove dvije
		 * tačke može biti izračunata koristeći se sljedećom formulom: d =
		 * radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 -
		 * y2)). Napisati program koij pita korisnika da unese geografsku širinu
		 * i dužinu u stepenima dvije tačke na površini zemlje te mu ispisuje
		 * great circle distance. Prosječni radius zemlje je 6.371.01 km.
		 * Stepene koje korisnik unese trebamo promijeniti u radianse koristeći
		 * se Math.toRadians metodom jer Java trigonometrijske metode koriste
		 * radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
		 * Koristimo negativne vrijednosti da označimo istok i jug.
		 */

		Scanner uInput = new Scanner(System.in);

		do {
			try {
				// User input
				System.out.println("Enter cooridantes in degrees:");
				System.out.println("x1:");
				double x1 = uInput.nextDouble();
				System.out.println("y1:");
				double y1 = uInput.nextDouble();
				System.out.println("x2:");
				double x2 = uInput.nextDouble();
				System.out.println("y2:");
				double y2 = uInput.nextDouble();

				// Converting degrees to radians
				x1 = Math.toRadians(x1);
				y1 = Math.toRadians(y1);
				x2 = Math.toRadians(x2);
				y2 = Math.toRadians(y2);

				// Declarin radius
				double radius = 6371.01;

				// Calcualting the great circle distance
				double d = radius
						* Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)
								* Math.cos(x2) * Math.cos(y1 - y2));

				// Printing out the result
				System.out.print("Great circle distance is ");
				System.out.printf("%4.2f", d);

				break;

			} catch (InputMismatchException ex) {
				System.out.println("Input exception");
				uInput.nextLine();

			}

		} while (true);
	}
}
