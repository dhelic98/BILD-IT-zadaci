package zadaci_06_03_2017;

public class MyCharacter {

	private int value;

	public MyCharacter(int value) {
		// COnstructor
		this.value = value;
	}

	public int charValue() {
		// method that returns value of character
		return this.value;
	}

	public int compareTo(char c) {
		// method for comparing another char with object
		if (this.value > ((int) c)) {
			return 1;
		} else if (this.value < ((int) c)) {
			return -1;
		} else {
			return 0;
		}

	}

	public static int compare(char c1, char c2) {
		// static method for comparing values of char
		if (c1 > c2) {
			return 1;
		} else if (c1 < c2) {
			return -1;

		} else {
			return 0;
		}

	}

	public static boolean isDigit(char c) {
		// returns true if digit
		return ((c > 47) && (c < 58));
	}

	public static boolean isLetter(char c) {
		// returns true if letter
		return ((c > 64 && c < 91) || (c > 96 && c < 123));
	}

	public static boolean isLowerCase(char c) {
		// returns true if letter is lower case
		return (c > 96 && c < 123);
	}

	public static boolean isUpperCase(char c) {
		// returns true if letter is upper case
		return (c > 64 && c < 91);
	}

	public boolean equals(MyCharacter c) {
		// method that compares character object
		return this.value == c.charValue();
	}

	public static char toLowerCase(char c) {
		// method that returns char in lower case
		if (isLowerCase(c))
			return c;
		else
			return (char) (c - 65 + 97);
	}

	public static char toUpperCase(char c) {
		// method that returns char in upper case
		if (isUpperCase(c))
			return c;
		else
			return (char) (c - 97 + 65);
	}

}
