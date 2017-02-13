package zadaci_09_02_17;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class zadatak_3 {

	public static void main(String[] args) throws IOException {
		/*
		 * Napišite program koji će brojati broj karaktera, riječi i linija
		 * teksta u nekom fileu. Riječi trebaju biti odvojene jednim spaceom.
		 * Ime file proslijediti kao argument u vaš program.
		 */
		String[] arguments = { "src/zadaci_09_02_17/zadatak_3.txt" };
		// Pozivamo metodu koja ce citati fajl
		fileReading(arguments);
	}

	public static void fileReading(String[] args) throws IOException {
		String fileName = args[0]; // Ime fajla uzimamo kao aregument
		Path path = Paths.get(fileName); // i prosljedujemo path-u
		if (!Files.exists(path)) {
			Files.createFile(path);
		}

		BufferedReader reader = Files.newBufferedReader(path);
		String line = "";// inicijalizacija line(reda)
		int charCounter = 0, wordCounter = 0, lineCounter = 0;

		// Prolazimo petljom kroz file
		while ((line = reader.readLine()) != null) {
			lineCounter++;
			// Broj linija tj redova se uvecaca
			String[] words = line.split(" ");
			wordCounter += words.length;
			// Broj rijeci se uvecava
			String temp = line.replace(" ", "");
			charCounter += temp.length();

		}

		// Zatvaramo reader
		reader.close();
		// Printamo brojace
		System.out.println("Broj linija u fajlu je " + lineCounter);
		System.out.println("Broj rijeci u fajlu je " + wordCounter);
		System.out.println("Broj karaktera u fajlu je " + charCounter);

	}

}
