package zadaci_22_02_2017;

public class zadatak_3 {

	public static void main(String[] args) {
		/*
		 * 3. Napisati program koji sabira sljedeću seriju 1/3 + 3/5 + 5/7 + 7/9
		 * + 9/11 + 11/13 ..... + 95/97 + 97/99.
		 */
		//Initializing sum
		double sum = 0;
		//Loop that goes from 1 to 97
		for (double i = 1; i <= 97; i += 2) {
			sum += (i / (i + 2));
		}
		//Printing out the result
		System.out.print("Sum is ");
		//comment
		System.out.printf("%4.2f", sum);
	} 

}
