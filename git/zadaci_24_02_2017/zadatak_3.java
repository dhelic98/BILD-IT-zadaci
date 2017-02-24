package zadaci_24_02_2017;

import java.util.Scanner;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. U javi, short vrijednost se sprema u samo 16 bita. Napisati
		 * program koji pita korisnika da unese short broj te mu ispiše svih 16
		 * bita za dati cijeli broj. Na primjer, ukoliko korisnik unese broj 5 -
		 * program mu ispisuje 0000000000000101
		 */

		Scanner uInput = new Scanner(System.in);

		while (true) {
			try {
				//Input by user
				System.out.println("Enter number of short type below 50");
				short number = uInput.nextShort();
				if (number > 50) {
					continue;
				}

				//Formating and printing out the result
				System.out.println("Bit for input is "
						+ String.format("%016d", Integer.parseInt(Integer
								.toBinaryString(number))));
				break;

			} catch (Exception ex) {
				System.out.println("Exception");
				uInput.nextLine();
			}
		}

		uInput.close();

	}

}
