package zadaci_20_02_2017;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Napisati metodu sa sljedećim headerom: public static int
		 * isPrime(int n) koja provjerava da li je broj prost/prime. Napsati
		 * test program koji poziva ovu metodu i ispisuje sve proste brojeve u
		 * rasponu od 0 do 100000.
		 */

		// Variable that counts printing
		int printCOunter = 0;
		// loop that goes fromn 0-100000
		for (int i = 0; i <= 100000; i++) {
			// if i is 0 or 1 it skips
			if ((i == 0) || (i == 1)) {
				continue;

			}
			// calling method and checking if number is prime
			if (isPrime(i) == 1) {
				System.out.print(i + " ");
				printCOunter++;
				if (printCOunter % 10 == 0) {
					System.out.println();
				}
			}

		}

	}

	public static int isPrime(int n) {
		// Method that returns 0 if number is not prime, and 1 if it is prime
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return 0;
			}
		}
		return 1;
	}

}
