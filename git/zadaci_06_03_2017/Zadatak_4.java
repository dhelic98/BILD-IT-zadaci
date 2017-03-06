package zadaci_06_03_2017;

public class Zadatak_4 {

	public static void main(String[] args) {
		/*
		 * (New string split method) The split method in the String class
		 * returns an array of strings consisting of the substrings split by the
		 * delimiters. However, the delimiters are not returned. Implement the
		 * following new method that returns an array of strings consisting of
		 * the substrings split by the matching delimiters, including the
		 * matching delimiters. public static String[] split(String s, String
		 * regex)
		 */
		// Testing split method
		String ff = "a?b?gf#e";
		String[] sp = Split.split(ff, "[?#]");

		for (int i = 0; i < sp.length; i++) {
			if (sp[i] != null)
				System.out.print(sp[i] + ",");
		}

		System.out.println();

		String str = "ab#12#453";
		String[] strArray = Split.split(str, "#");

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] != null)
				System.out.print(strArray[i] + ",");
		}
	}

}
