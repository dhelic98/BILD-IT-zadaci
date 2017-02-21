package zadaci_21_02_2017;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Palindrome prime je prosti broj koji je također i palindrom. Na
		 * primjer, 131 je palindrome prime, kao i brojevi 313 i 757. Napisati
		 * program koji ispisuje prvih 100 palindrome prime brojeva, 10 brojeva
		 * po liniji.
		 */
		int printCounter = 0;
		int number = 2;
		while (printCounter < 100) {
			if (isPrime(number) && (isPalindrome(number))) {
				System.out.printf("%5d ", number);
				printCounter++;
				if (printCounter % 10 == 0) {
					System.out.println();
				}
			}
			number++;

		}

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
