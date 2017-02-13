package zadaci_09_02_17;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji ispisuje sve prestupne godine, 10 po liniji, od
		 * godine 101 do 2100, odvojene jednim spaceom. Također ispisati i
		 * ukupan broj prijestupnih godina u ovom vremenskom periodu.
		 */

		printanje();
		// Pozivamo metodu

	}

	public static void printanje() {
		int printCounter = 0;
		// Brojac koji nam pomaze pri printanju godina
		int leapYearCounter = 0;
		// Brojac koji prebrojava koliko ima ukupno prestupnih godina
		for (int i = 101; i <= 2100; i++) {
			if ((i % 4 == 0) || (i % 400 == 0)) {
				// Provjera da li je godina prijestupna
				System.out.print(i + " ");
				printCounter++;
				leapYearCounter++;

			}
			if (printCounter % 10 == 0) { // Pritanje 10 godina po
											// liniji

				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Prijestupnih godina od 101 do 2100 godine ima "
				+ leapYearCounter);

	}

}
