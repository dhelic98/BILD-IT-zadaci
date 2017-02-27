package zadaci_27_02_2017;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 
		 * (Compute the weekly hours for each employee) Suppose the weekly hours
		 * for all employees are stored in a two-dimensional array. Each row
		 * records an employee’s seven-day work hours with seven columns. For
		 * example, the following array stores the work hours for eight
		 * employees. Write a program that displays employees and their total
		 * hours in decreasing order of the total hours.
		 * 
		 * Employee 0 2 4 3 4 5 8 8 Employee 1 7 3 4 3 3 4 4 Employee 2 3 3 4 3
		 * 3 2 2 Employee 3 9 3 4 7 3 4 1 Employee 4 3 5 4 3 6 3 8 Employee 5 3
		 * 4 4 6 3 4 4 Employee 6 3 7 4 8 3 8 4 Employee 7 6 3 5 9 2 7 9
		 */
		// Initializing arrayLists
		ArrayList<Integer> sumOfWorkHours = new ArrayList<>();
		ArrayList<Integer> sortedSumOfWorkHours = new ArrayList<>();
		// Creating array with number of work hours
		int[][] workHours = { { 2, 4, 3, 4, 5, 8, 8 }, { 7, 3, 4, 3, 3, 4, 4 },
				{ 3, 3, 4, 3, 3, 2, 2 }, { 9, 3, 4, 7, 3, 4, 1 },
				{ 3, 5, 4, 3, 6, 3, 8 }, { 3, 4, 4, 6, 3, 4, 4 },
				{ 3, 7, 4, 8, 3, 8, 4 }, { 6, 3, 5, 9, 2, 7, 9 } };
		// Summing work hours for each empolyee
		int sum = 0;
		for (int i = 0; i < workHours.length; i++) {
			for (int j = 0; j < workHours[i].length; j++) {
				sum += workHours[i][j];

			}
			// Inseting sum into arrayList
			sumOfWorkHours.add(sum);
			sortedSumOfWorkHours.add(sum);
			sum = 0;

		}
		// Sorting arrayList-s and reversing them for decreasing order
		Collections.sort(sortedSumOfWorkHours);
		Collections.reverse(sortedSumOfWorkHours);

		// Loop for printing out the result
		for (int i = 0; i < sortedSumOfWorkHours.size(); i++) {

			for (int j = 0; j < sumOfWorkHours.size(); j++) {
				if (sortedSumOfWorkHours.get(i).equals(sumOfWorkHours.get(j))) {
					System.out.println("Empolyee " + (j + 1) + ": "
							+ sortedSumOfWorkHours.get(i)
							+ " working hours this week");

				}

			}
		}

	}
}
