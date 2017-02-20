package zadaci_20_02_2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak_4 {

	public static void main(String[] args) {
		/*
		 * 4. Napisati program koji pita korisnika da unese 3 cijela broja te mu
		 * ispiše ta ista tri broja u rastućem redosljedu. Bonus: Napisati
		 * metodu koja prima tri cijela broja kao argumente te vraća brojeve u
		 * rastućem redosljedu.
		 */
		Scanner uInput = new Scanner(System.in);
		do {
			try {
				//Input by user
				System.out.println("Enter 3 whole numbers.");
				System.out.println("Enter 1st:");
				int number1 = uInput.nextInt();
				System.out.println("Enter 2nd:");
				int number2 = uInput.nextInt();
				System.out.println("Enter 3rd:");
				int number3 = uInput.nextInt();
//Printing out the result
				System.out.print("Numbers sorted are: ");
				//Calling the method 
				ArrayList<Integer> sortedInput = sort(number1, number2, number3);
				for (int i = 0; i < sortedInput.size(); i++) {
					System.out.print(sortedInput.get(i) + " ");
				}
				break;

			} catch (InputMismatchException ex) {
				System.out.println("Wrong input");
				uInput.nextLine();
			}

		} while (true);
		uInput.close();

	}

	public static ArrayList<Integer> sort(int n1, int n2, int n3) {
		//method that returns arrayList with sorted integer numbers
		ArrayList<Integer> list = new ArrayList<>();
		list.add(n1);
		list.add(n2);
		list.add(n3);
		Collections.sort(list);

		return list;

	}

}
