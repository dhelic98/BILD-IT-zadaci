package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * (Divisible by 2 or 3) Find the first ten numbers with 50 decimal
		 * digits that are divisible by 2 or 3.
		 */
		// Creating string with 1 and 50 decilam 0-s
		String bigNum = "" + 1;
		for (int i = 0; i < 50; i++) {
			bigNum += "0";
		}
		// turning string into big decimal
		BigDecimal bigD = new BigDecimal(bigNum);

		int bigDCOunt = 0;
		// loop that goes until 10 bigD numbers are found that are divisible by
		// 2 or 3
		while (bigDCOunt < 10) {

			BigDecimal remainder2 = bigD.remainder(new BigDecimal(2));
			BigDecimal remainder3 = bigD.remainder(new BigDecimal(3));

			if (remainder2.equals(BigDecimal.ZERO)
					|| (remainder3.equals(BigDecimal.ZERO))) {
				bigDCOunt++;
				System.out.println(bigD.toString() + " ");
			}
			bigD = bigD.add(BigDecimal.ONE);

		}

	}

}
