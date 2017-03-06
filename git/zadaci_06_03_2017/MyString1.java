package zadaci_06_03_2017;

public class MyString1 {
	private char[] chars;

	public MyString1(char[] chars) {
		// Constructor
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}

	}

	public char charAt(int index) {
		// Method that returns char at index
		return this.chars[index];
	}

	public int length() {
		// returning length
		return this.chars.length;

	}

	public MyString1 substring(int begin, int end) {
		// return MyString1 object by creating shorter string
		char[] sub = new char[end - begin];
		for (int i = begin; i < end; i++) {
			sub[i - begin] = this.chars[i];

		}
		return new MyString1(sub);

	}

	public MyString1 toLowerCase() {
		// Returning object with lowercase
		// A=65
		// a=97

		char[] lowerCase = new char[this.chars.length];
		for (int i = 0; i < lowerCase.length; i++) {
			if ((chars[i] >= 'A') && (chars[i] <= 'Z')) {
				lowerCase[i] = ((char) (this.chars[i] + 32));
			} else {
				lowerCase[i] = this.chars[i];
			}

		}

		return new MyString1(lowerCase);
	}

	public boolean equals(MyString1 s) {
		// method that checks if object are equal
		if (s.length() != this.chars.length) {
			return false;
		}
		for (int i = 0; i < chars.length; i++) {
			if (s.charAt(i) != this.chars[i]) {
				return false;
			}

		}

		return true;
	}

	public static MyString1 valueOf(int i) {

		// Returning value of object
		int length = numberLength(i);
		char[] number = new char[length];
		for (int j = length - 1; j >= 0; j--) {
			number[j] = (char) ('0' + (i % 10));
			i /= 10;
		}
		return new MyString1(number);
	}

	public static MyString1 valueOf(long i) {

		// Returning value of object
		int length = numberLength(i);
		char[] number = new char[length];
		for (int j = length - 1; j >= 0; j--) {
			number[j] = (char) ('0' + (i % 10));
			i /= 10;
		}
		return new MyString1(number);
	}

	public static int numberLength(long i) {
		int lenght = 0;
		while (i > 0) {
			i /= 10;
			lenght++;
		}
		return lenght;
	}

	public void MyStringPrint() {
		// method for printing out

		for (int i = 0; i < chars.length; i++) {
			System.out.print(this.chars[i]);

		}
		System.out.println();
	}
}
