package zadaci_04_03_2017;

import java.math.BigDecimal;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Divisible by 5 or 6) Find the first ten numbers greater than
		 * Long.MAX_VALUE that are divisible by 5 or 6.
		 */
		// Initializinbg bigDecimal as number larger than long.max_value
		BigDecimal num = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
		int count = 0;
		while (count < 10) {

			if (num.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO)
					|| num.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
				count++;
				System.out.println(count + ": " + num);
			}
			num = num.add(BigDecimal.ONE);
		}

	}

}
