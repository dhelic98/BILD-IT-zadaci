package zadaci_08_02_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji učitava niz brojeva, pronalazi najveći broj te
		 * ispisuje koliko se puta taj broj ponavlja. Pretpostavimo da se unos
		 * brojeva završava sa nulom.
		 */

		Scanner uInput = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> ponavljanja = new ArrayList<>();
		System.out.println("Unesite broj");
		int broj = uInput.nextInt();
		while (broj != 0) {
			list.add(broj);
			broj = uInput.nextInt();

		}
		Collections.sort(list);
		Collections.reverse(list);
		int max = list.get(0);
		int maxCounter = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(max)) {
				maxCounter++;
			}
		}
		System.out.println("Najveci broj je " + max + " i ponovio se "
				+ maxCounter);

	}
}
