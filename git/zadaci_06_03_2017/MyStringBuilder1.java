package zadaci_06_03_2017;

public class MyStringBuilder1 {
	private String str;

	public MyStringBuilder1(String s) {
		// Constructor
		this.str = s;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {
		// Method that creates new string by combining strings
		return new MyStringBuilder1(this.str + s.toString());
	}

	public MyStringBuilder1 append(int i) {
		// Creating string from number
		String build = "";

		while (i != 0) {
			build = i % 10 + build;
			i /= 10;
		}
		return new MyStringBuilder1(this.str + build);
	}

	public int length() {
		// method that returns lenght of string
		return this.str.length();
	}

	public char charAt(int index) {
		// method that returns char at given index
		return this.str.charAt(index);
	}

	public MyStringBuilder1 toLowerCase() {
		// return lower case
		// A=65
		// a=97

		String lowerCase = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
				lowerCase += ((char) (this.str.charAt(i) + 32));
			} else {
				lowerCase += this.str.charAt(i);
			}

		}

		return new MyStringBuilder1(lowerCase);

	}

	public MyStringBuilder1 substring(int begin, int end) {
		// Method that returns substring
		String sub = "";

		for (int i = begin; i < end; i++) {
			sub += str.charAt(i);
		}
		return new MyStringBuilder1(sub);

	}

	public String toString() {
		// method for returning String of object
		return this.str;
	}
}
