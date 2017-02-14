package zadaci_14_02_2017;

import java.util.Scanner;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Napisati program koji učitava iznos investicije, godišnju
		 * interesnu stopu i broj godina te vraća buduću vrijednost investicije
		 * koristeći se sljedećom formulom: buducaVrijednostInvesticije =
		 * iznosInvesticije * (1 + mjesecnaInteresnaStopa)^brojGodina*12. Na
		 * primjer, ukoliko uneste kao iznos investicije 1000, 3.25 kao godišnju
		 * interesnu stopu i 1 kao broj godina program vam vraća 1032.98 kao
		 * buducu vrijednost investicije.
		 */

		Scanner uInput = new Scanner(System.in);
		do {
			try {
				// Unos od strane korisnika
				System.out.println("Unesite iznos investicije");
				long iznosInvesticije = uInput.nextLong();
				System.out.println("Unesite godisnju stopu");
				double godisnjastopa = uInput.nextDouble();
				System.out.println("Unesite broj godina");
				int godina = uInput.nextInt();

				boolean wrongInput = true;
				// Uslov za pozitivan unos
				while (wrongInput == true) {
					if (iznosInvesticije <= 0) {
						System.out
								.println("Investicija mora biti veci od nule");
						iznosInvesticije = uInput.nextLong();
						continue;
					}
					if (godisnjastopa <= 0) {
						System.out
								.println("Godisnja stopa  mora bit veci od nule");
						godisnjastopa = uInput.nextDouble();
						continue;
					}
					if (godina <= 0) {
						System.out.println("Godina mora biti veca nule");
						godina = uInput.nextInt();
						continue;
					}
					wrongInput = false;

				}
				// Pozivanje metode
				double futureValue = investicija(iznosInvesticije,
						godisnjastopa, godina);
				// Ispis stanja
				System.out.print("Iznos nakon " + godina
						+ " godina iznosit ce ");
				// Formatiranje ispisa rezultata
				System.out.printf("%5.2f", futureValue);
				System.out.print(" KM.");

				break;

			} catch (Exception ex) {
				System.out.println("There was an exception");
				uInput.nextLine();

			}

		} while (true);
		//Zatvaramo skener
		uInput.close();

	}

	public static double investicija(long investicija, double stopa, int godine) {
		// Metoda koja racuna stanje na racunu nakon unesenih godina
		double mjesecnastopa = (stopa / 100) / 12;
		double povecanje = Math.pow((1 + mjesecnastopa), godine * 12);
		double stanjeNakonXGodina = investicija * povecanje;
		return stanjeNakonXGodina;

	}
}
