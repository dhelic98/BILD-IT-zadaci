package zadaci_18_02_2017;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji ispisuje sve proste brojeve od 2 do 1000,
		 * ukljućujući i 2 i 1000. Program treba da ispiše 8 brojeva po liniji
		 * te razmak između brojeva treba da bude jedan space.
		 */
		
		
		//Variable for counting number of time printed
		int printCounter = 0;
		//loop that goes from 2-1000
		for (int i = 2; i <= 1000; i++) {
			//calling method as condition for printing
			if (isPrime(i)) {
				System.out.print(i + " ");
				printCounter++;
				//condition for new line
				if (printCounter % 8 == 0) {
					System.out.println();
				}
			}

		}

	}

	public static boolean isPrime(int number) {
		//Method for finding if number is prime
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
