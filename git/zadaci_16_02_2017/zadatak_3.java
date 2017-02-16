package zadaci_16_02_2017;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 
		 * 3. Napišite program koji ispisuje sve brojeve, od 100 do 1000, 10
		 * brojeva po liniji, koji su djeljivi i sa 5 i sa 6. Razmak između
		 * brojeva treba biti tačno jedan space.
		 */
		// Declaring variable that counts times printed
		int numPrinted = 0;
		// Loop that goes from 100-1000
		for (int i = 100; i <= 1000; i++) {
			//Condition for printing number
			if ((i % 5 == 0) && (i % 6 == 0)) {
				System.out.print(i + " ");
				numPrinted++;
				//Condition for going to new line
				if (numPrinted % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

}
