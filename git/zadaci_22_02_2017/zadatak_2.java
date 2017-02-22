package zadaci_22_02_2017;

import java.util.Random;
import java.util.Scanner;

public class zadatak_2 {

	public static void main(String[] args) {
		/*
		 * 2. Napisati program koji igra sa protivnikom rock-paper-scissors.
		 * (papir-bunar-makaze ili tako nekako po naški) Program nasumično
		 * generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze.
		 * Program pita korisnika da unese 0, 1 ili 2 te mu ispisuje poruku da
		 * li je korisnik pobijedio, da li je računar pobijedio ili je bilo
		 * neriješeno.
		 */
		Scanner uInput = new Scanner(System.in);
		System.out.println("Welcome to rock-paper-scissors");
		do {
			try {
				// Input by user
				System.out.println("0-rock\n1-paper\n2-scissors");
				int userOption = uInput.nextInt();
				while (userOption < 0 || userOption > 2) {
					System.out.println("Input must be between 0 and 2");
					userOption = uInput.nextInt();
				}
				// generating random
				Random random = new Random();
				int computerOption = random.nextInt(3);
				// Condition for tie
				if (userOption == computerOption) {
					System.out.println("It is a tie\nTry again");
					// condition for win
				} else if ((userOption == 0 && computerOption == 2)
						|| (userOption == 1 && computerOption == 0)
						|| (userOption == 2 && computerOption == 1)) {
					System.out.println("You win!!!");

				} else {
					System.out.println("You lose :(");

				}
				// Input for stopping program
				System.out.println("Would you like to quit\n(1)Yes \n(0)No");
				int quitOption = uInput.nextInt();
				if (quitOption == 1) {
					break;
				} else if (quitOption == 0) {
					continue;
				} else {
					System.out.println("Wrong input");
					break;
				}

			} catch (Exception ex) {
				System.out.println("Wrong input");
				uInput.nextLine();

			}

		} while (true);

	}

}
