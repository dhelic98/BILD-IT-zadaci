package zadaci_20_02_2017;

public class zadatak_1 {

	public static void main(String[] args) {
		/*
		 * 1. Pretpostavimo da se registarska tablica za auto sastoji od tri
		 * uppercase karaktera i 4 broja u sljedećem formatu AAA-1234. Napisati
		 * program koji nasumično generiše tablicu.
		 */

		//Initializing string that will hold plate number
		String plates = "";
		//loop that generates 3 upper case letters
		for (int i = 0; i < 3; i++) {
			char c = (char) (Math.random() * 26 + 65);
			plates += c;
		}
		plates += "-";
		//loop that generates 4 number
		for (int i = 0; i < 4; i++) {
			plates += (int) (Math.random() * 9);
		}
		
		//Printing out the result
		System.out.println("Your plate is " + plates);

	}

}
