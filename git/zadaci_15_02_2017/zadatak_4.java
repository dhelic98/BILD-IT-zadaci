package zadaci_15_02_2017;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih
		 * svojih pozitivnih djelilaca, isključujući sebe. Na primjer, 6 je prvi
		 * savršeni broj jer 6 = 3 + 2 + 1. Sljedeći savršeni broj je 28 jer 28
		 * = 14 + 7 + 4 + 2 + 1. Samo 4 savršena broja postoje u rasponu od 0 do
		 * 10.000. Napišite program koji ispisuje sva 4.
		 */

		// Declaring sum
		int sum = 0;
		System.out.print("Perfect numbers from 1-10000 are: ");
		// loop that goes till 10k and finds 4 perfec numbers
		for (int i = 1; i <= 10000; i++) {
			// Loop that finds divisors and adds them up
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum += j;
				}

			}
			// System.out.println(sum);
			if (sum == i) {

				System.out.print(i + ", ");
			}
			sum = 0;

		}

	}

}
