package zadaci_06_03_2017;

public class Split {
	
	public static String[] split(String string, String regex) {
		// Method that splits string by given regex
		String[] splitS = new String[string.length()];
		int arrayIndex = 0;

		// checking if regex is array
		if ((regex.charAt(0) == '[')
				&& (regex.charAt(regex.length() - 1) == ']')) {
			regex = regex.substring(1, regex.length() - 1);

		}

		// loop that goes trough string
		for (int i = 0; i < splitS.length; i++) {
			if (splitS[arrayIndex] == null) {
				splitS[arrayIndex] = "";
			}

			if (regex.contains(string.charAt(i) + "")) {
				// condition for splitting
				splitS[arrayIndex + 1] = string.charAt(i) + "";

				arrayIndex += 2;

			} else {

				splitS[arrayIndex] += string.charAt(i);

			}

		}

		return splitS;

	}

}
