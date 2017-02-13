package zadaci_13_02_2017_Bonus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * Napisati aplikaciju koja prima od korisnika unos (broj godina koji
		 * korisnik želi da se vrati u prošlost) te ispisuje korisniku broj:
		 * 
		 * 1. Sekundi, minuta i sati koliko bi trebalo putovati da se vrati do
		 * navedene godine u prošlosti. 2. BONUS: Dana, mjeseci, godina koliko
		 * bi trebalo putovati da se vrati do navedene godine u prošlosti. 3.
		 * BONUS: Decenija, stoljeća, milenija koliko bi trebalo putovati da se
		 * vrati do navedene godine u prošlosti.
		 * 
		 * Drugi način da dobijemo osjećaj za duboko vrijeme je da zamislimo da
		 * nas jedan korak (~75 cm) vraća 1 godinu u prošlost. Naša aplikacija
		 * treba da ispisuje i sljedeće (za isti unos kao i gore):
		 * 
		 * 1. Broj centimetara, metara i kilometara koje bi trebalo prohodati da
		 * se vrati do navedene godine u prošlosti. 2. Broj puta koliko bi
		 * prehodali prosječni fudbalski stadion (105 m) 3. Broj puta koliko bi
		 * prehodali obim zemlje (obim zemlje: 40.075 km)
		 */

		Scanner uInput = new Scanner(System.in);
		do {
			try {
				// Unos od strane korisnika
				System.out
						.println("Zamislimo da imamo avion koji može letjeti u prošlost brzinom od jedne godine po sekundi");
				System.out.println("Unesite koliko godina unazad zelite ici?");
				long years = uInput.nextLong();
				// Dkelarisemo arrayListu i pozivamo metodu
				ArrayList<Double> timeSpentOnTravel = timeSpentAirplane(years);
				System.out.print("Da bi otputovali " + years
						+ " godina u proslost trebamo:\n");
				System.out.printf("%4.2f", timeSpentOnTravel.get(0));
				System.out.print(" sekundi ili ");
				System.out.printf("%4.2f", timeSpentOnTravel.get(1));
				System.out.print(" minuta ili ");
				System.out.printf("%4.2f", timeSpentOnTravel.get(2));
				System.out.print(" sati\n");
				System.out.printf("%4.2f", timeSpentOnTravel.get(3));
				System.out.print(" dana ili ");
				System.out.printf("%4.2f", timeSpentOnTravel.get(4));
				System.out.print(" mjeseci ili ");
				System.out.printf("%4.2f", timeSpentOnTravel.get(5));
				System.out.print(" godina\n");
				System.out.printf("%4.2f", timeSpentOnTravel.get(6));
				System.out.print(" desetljeca ili ");
				System.out.printf("%4.2f", timeSpentOnTravel.get(7));
				System.out.print(" stoljeca ili ");
				System.out.printf("%4.2f", timeSpentOnTravel.get(8));
				System.out.print(" milenijuma");

				break;

			} catch (InputMismatchException ex) {
				System.out.println("Pogresan unos");
				uInput.nextLine();

			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}

		} while (true);
	}

	public static ArrayList<Double> timeSpentAirplane(long yearsIntoHistory) {
		// Metoda koja preracunava vrijeme
		ArrayList<Double> time = new ArrayList<>();
		double seconds = yearsIntoHistory * 1;
		time.add(seconds);
		double minutes = seconds / 60;
		time.add(minutes);
		double hours = minutes / 60;
		time.add(hours);
		double day = hours / 24;
		time.add(day);
		double months = day / 30;
		time.add(months);
		double years = months / 12;
		time.add(years);
		double decenije = years / 10;
		time.add(decenije);
		double century = years / 100;
		time.add(century);
		double millenium = years / 1000;
		time.add(millenium);

		return time;
	}

}
