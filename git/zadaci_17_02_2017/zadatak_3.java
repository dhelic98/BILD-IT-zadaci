package zadaci_17_02_2017;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji ispisuje sve moguće kombinacije za biranje
		 * dva broja u rasponu od 1 do 7. Također, program ispisuje broj svih
		 * mogućih kombinacija. Dakle, program treba da ispiše sve moguće parove
		 * brojeva u datom rasponu, krenuvši sa 1 2, 1 3, 1 4, itd. Broj mogućih
		 * kombinacija je 21.
		 */

		// Variable that will count number of combinations
		int combCounter = 0;

		// loop that goes from 1-7
		for (int i = 1; i <= 7; i++) {
			// second loop that gets second number in combination
			for (int j = i + 1; j <= 7; j++) {
				// Printing out the combination
				System.out.print(i + ":" + j + " ");
				combCounter++;

			}
			System.out.println();
		}

		System.out.println("Number of combinations is " + combCounter);

	}

}
