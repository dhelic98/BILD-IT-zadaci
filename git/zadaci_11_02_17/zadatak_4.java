package zadaci_11_02_17;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Napisati metodu koja printa 100 nasumičnih uppercase karaktera i 100
		 * nasumičnih brojeva, 10 po liniji.
		 */

		// Pozivanje metode
		randomPrint();

	}

	public static void randomPrint() {
		// Deklarisanje varijabli
		// Varijabla koja odreduje da li ce broj ili slovo biti printano
		int randomChar = 0;
		// varijabla pomocu koje generisemo random broj
		int randomNumber = 0;
		// varijabla kojom generisemo random slovo
		char randomLetter = 0;
		// varijabla kojom pratimo printanje
		int printCounter = 0;
		// varijabla koja prati broj printanja slova
		int lettersPrinted = 0;
		// pratimo broj printanih brojeva
		int numbersPrinted = 0;
		// prolazimo kroz petlju koja nam pomaze da isprintamo 100 random
		// znakova
		for (int i = 0; i < 200; i++) {
			randomChar = (int) (Math.random() * 2);
			if (randomChar == 0) {
				// Provjeravamo broj isprintanih brojeva
				if (numbersPrinted == 50) {
					continue;
				} else {
					// Generisanje i printanje brojeva
					randomNumber = (int) (Math.random() * 100);
					System.out.print(randomNumber + " ");
					printCounter++;
					numbersPrinted++;
					if (printCounter % 10 == 0) {
						System.out.println();
					}
				}
			} else if (randomChar == 1) {
				// Provjeravamo broj isprintanih slova
				if (lettersPrinted == 50) {
					continue;

				} else {
					// Generisanje i printanje slova
					randomLetter = (char) (Math.random() * 26 + 65);
					System.out.print(randomLetter + " ");
					printCounter++;
					lettersPrinted++;
					if (printCounter % 10 == 0) {
						System.out.println();
					}
				}
			}

		}
	}

}
