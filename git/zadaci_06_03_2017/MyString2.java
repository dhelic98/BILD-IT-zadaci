package zadaci_06_03_2017;

public class MyString2 {
	private String string;

	public MyString2(String s) {
		this.string = s;
	}

	public char[] toChars() {
		// mehtod that returns char array
		char[] chars = new char[this.string.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = this.string.charAt(i);
		}

		return chars;
	}

	public MyString2 toUpperCase() {
		// return upper case
		// A=65
		// a=97

		String upperCase = "";
		for (int i = 0; i < string.length(); i++) {
			if ((string.charAt(i) >= 'a') && (string.charAt(i) <= 'z')) {
				upperCase += ((char) (this.string.charAt(i) - 32));
			} else {
				upperCase += this.string.charAt(i);
			}

		}

		return new MyString2(upperCase);
	}

	public MyString2 substring(int begin) {
		// method for changing string
		String sub = "";
		for (int i = begin; i < this.string.length(); i++) {
			sub += this.string.charAt(i);
		}

		return new MyString2(sub);

	}

	public int compare(String s) {
		// comparing strings
		int result = 0;
		for (int i = 0; i < Math.min(s.length(), this.string.length()); i++) {

			char c = s.charAt(i);
			char c1 = this.string.charAt(i);

			if (c != c1) {
				result = ((int) c1) - ((int) c);
			}

		}

		return result;
	}

	public static MyString2 valueOf(boolean b) {
		if (b) {
			return new MyString2("true");
		} else {
			return new MyString2("false");
		}
	}

	@Override
	public String toString() {
		return this.string;
	}
}
