package zadaci_17_02_2017;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Twin prime brojevi su par prostih brojeva koji se razlikuju za 2.
		 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su
		 * također twin primes. Napisati program koji ispisuje sve twin prime
		 * brojeve manje od 10000, 10 parova po liniji.
		 */
		
		//variable that counts number of times printed
		int printCounter = 0;
		
		
		//loop that goes from 1-10000 and prints out twin primes
		for (int i = 1; i <= 10000; i++) {
			//calling of the isPrime method
			if ((isPrime(i)) && (isPrime(i + 2))) {
				System.out.print(i + ":" + (i + 2)+" ");
				printCounter++;
				if (printCounter % 10 == 0) {
					System.out.println();
				}

			}

		}

	}

	public static boolean isPrime(int number) {
		//method that checks 
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}

}
