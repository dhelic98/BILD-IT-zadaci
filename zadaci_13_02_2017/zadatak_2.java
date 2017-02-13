package zadaci_13_02_2017;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji simulira nasumično izvlačenje karte iz špila
		 * od 52 karte. Program treba ispisati koja karta je izvučena (A, 2, 3,
		 * 4, 5, 6, 7, 8, 9, 10, J, Q ili K) te znak u kojem je data karta
		 * (Srce, Pik, Djetelina, Kocka). Primjer: Karta koju ste izvukli je 10
		 * u znaku kocke.
		 */
		try {
			// Ubacujemo karte u array String tipa
			String[] suits = { "Spades", "Heart", "Clubs", "Diamonds" };
			String[] cards = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9",
					"10", "Jack", "Queen", "King" };

			// Printamo "koju je kartu korisnik izvukao" koristeci math.random
			// metodu
			System.out.println("Your card is: "
					+ cards[(int) (Math.random() * 13)] + " of "
					+ suits[(int) (Math.random() * 4)]);
		} catch (Exception ex) {
			System.out.println("How is there an exception here :)");
		}

	}

}
