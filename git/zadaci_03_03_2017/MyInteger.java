package zadaci_03_03_2017;

public class MyInteger {
	// Data field
	private int value;

	// Constructor
	MyInteger(int value) {
		this.value = value;

	}

	// getter method
	public int getValue() {
		return value;
	}

	// Instance methods that return true/false for even, odd and prime
	public boolean isEven() {
		if (isEven(this.value)) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isOdd() {
		if (!isOdd(this.value)) {
			return false;
		} else {
			return true;
		}
	}

	public boolean isPrime() {
		if (isPrime(this.value)) {
			return true;
		} else {
			return false;
		}
	}

	// Equals methods
	public boolean equals(int n) {
		if (this.value == n) {
			return true;
		}

		return false;

	}

	public boolean equals(MyInteger myInt) {
		if (this.value == myInt.value) {
			return true;
		} else {

			return false;
		}
	}

	// Static isEven isOdd and isPrime for int
	public static boolean isEven(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(int n) {
		if (n % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Static isEven isOdd and isPrime for MyInteger object
	public static boolean isEven(MyInteger myint) {
		if (myint.getValue() % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isOdd(MyInteger myint) {
		if (myint.getValue() % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}

	public static boolean isPrime(MyInteger myint) {
		for (int i = 2; i <= myint.getValue() / 2; i++) {
			if (myint.getValue() % i == 0) {
				return false;
			}
		}

		return true;
	}

	// Converting char array and string into number
	public static int parseInt(char[] m) {
		String s = "";
		for (int i = 0; i < m.length; i++) {
			s += m[i];
		}
		return Integer.parseInt(s);

	}

	public static int parseInt(String s) {

		return Integer.parseInt(s);

	}

}
