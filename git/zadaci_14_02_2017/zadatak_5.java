package zadaci_14_02_2017;

import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * 5. Ako imamo ubrzanje aviona a te brzinu pri kojoj avion uzlijeće v,
		 * možemo izračunati minimalnu dužinu piste potrebne da avion uzleti
		 * koristeći se sljedećom formulom: dužina = v * v / 2a. Napisati
		 * program koji pita korisnika da unese v u m/s i a u m/s² te ispisuje
		 * korisniku minimalnu dužinu piste. (Primjer: ukoliko unesemo 60 za
		 * brzinu i 3.5 za ubrzanje dužina piste je 514.286)
		 */
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				// Unos od strane korisnika
				System.out.println("Please enter speed of plane (m/s)");
				double speedOfPlane = uInput.nextDouble();
				System.out
						.println("Please enter the acceleration of plane(m/s^2)");
				double accelerationOfPlane = uInput.nextDouble();

				boolean wrongInput = true;
				// uslov za unos brojeva
				while (wrongInput) {
					if (speedOfPlane <= 0) {
						System.out
								.println("Please enter speed higher than 0 m/s");
						speedOfPlane = uInput.nextDouble();
						continue;
					}
					if (accelerationOfPlane <= 0) {
						System.out
								.println("Please enter acceleration that is higher than 0 m/s^2");
						continue;
					}
					wrongInput = false;
				}

				// Formula za duzinu
				double minimumLength = (speedOfPlane * speedOfPlane)
						/ (2 * accelerationOfPlane);
				// Ispis
				System.out.print("Minimal lenght of airstrip is : ");
				System.out.printf("%4.2f", minimumLength);
				System.out.print(" m.");
				break;

			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);
		// Zatvaranje skenera
		uInput.close();
	}

}
