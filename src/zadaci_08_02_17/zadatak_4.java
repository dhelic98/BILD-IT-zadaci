package zadaci_08_02_17;

import java.util.ArrayList;
import java.util.Collections;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * Napišite program koji generiše 100 nasumičnih cijelih brojeva između
		 * 0 i 9 te ispisuje koliko se puta koji broj ponovio.
		 */
		ArrayList<Integer> list = new ArrayList<>();
		int[] ponavljanje = new int[10];
		int random = 1;
		// Generisemo 100 random brojeva u arraylisti
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 9);
			list.add(random);
		}
		// Sortiranje liste
		Collections.sort(list);
		// Prebrojavanje ponavljanja u array-u
		for (int i = 0; i < list.size(); i++) {
			ponavljanje[list.get(i)]++;
		}
		// Printanje liste koja sadrzava broj ponvaljanja
		for (int i = 0; i < ponavljanje.length; i++) {
			System.out.println("Broj " + i + " se ponovio " + ponavljanje[i]);
		}

	}

}
