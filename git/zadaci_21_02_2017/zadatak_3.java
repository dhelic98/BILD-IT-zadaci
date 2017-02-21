package zadaci_21_02_2017;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je
		 * prosti broj i kada ispišemo naopako. Na primjer, broj 17 i broj 71 su
		 * prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. Napisati
		 * program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji.
		 */
		int printCounter = 0;
		int number = 2;
		while (printCounter < 100) { 
			if (isEmirp(number)) {
				
				//Printing out emirp numbers
				System.out.printf("%4d ",number);
				printCounter++;
				if (printCounter % 10 == 0) {
					System.out.println();
				}
			}
			number++;
		}

	}

	public static boolean isEmirp(int number) {
		//method that checks if numbers are emirp
		if (isPrime(number) && (isPrime(getReverse(number)))
				&& (!isPalindrome(number))) {
			return true;

		}
		return false;
	}

	public static boolean isPrime(int number) {
		//method that check if numbers are prime
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int getReverse(int number) {
		//method that checks if numbers are palindrome
		String reverseNum = "";
		while (number > 0) {
			reverseNum += number % 10;
			number /= 10;
		}

		return Integer.parseInt(reverseNum);
	}

	public static boolean isPalindrome(int number) {
		//method that checks if numbers are palindrome
		if (number != getReverse(number)) {
			return false;
		}

		return true;
	}

}
