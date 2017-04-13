package priprema;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exploreTheWorld {

	// method for inputs

	public static void main(String[] args) {
		Scanner uInput = new Scanner(System.in);
		while (true) {
			try {
				// connect object that connects to the database
				Connection myCon = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/world", "root", "");
				// statement object that implements simple SQL statements
				Statement statement = myCon.createStatement();
				String query = "";
				// user options
				System.out
						.println("Welcome to world database! Select a query:");
				
				System.out
						.println("1 - If you want a info about a specific country;");
				System.out
						.println("2 - If you want a info about a specific city;");
				System.out
						.println("3 - If you want to search countries by continent;");
				System.out
						.println("4 - If you want to see a list of 10 most populated countries in the world;");
				System.out
						.println("5 - If you want to see a list of 10 most populated cities in the world;");
				System.out
						.println("6 - If you want to see a list of countries starting with specific letter;");

				int option = uInput.nextInt();
				while (option < 0 || option > 9) {
					System.out.println("Wrong number, try again");
					option = uInput.nextInt();
				}

				switch (option) {
			
				case 1: {
					System.out.println("Enter a country name:");
					String country = uInput.next().toUpperCase();
					// query with the user input
					query = "SELECT * from country where name = '" + country
							+ "';";
					ResultSet result = statement.executeQuery(query);
					// prints the result of the query
					while (result.next()) {
						
						System.out.println("Name: "+result.getString("Name") + ", continent: "
								+ result.getString("Continent") + ", region: "
								+ result.getString("Region") + ", population: "
								+ result.getString("Population") + ", surfacearea: "
								+ result.getString("SurfaceArea"));
					}
					break;
				}
				case 2: {
					System.out.println("Enter a city name:");
					String city = uInput.next().toUpperCase();
					// query with the city name entered by user
					query = "SELECT * from city where name = '" + city + "';";
					// executes it
					ResultSet result = statement.executeQuery(query);
					// prints it
					while (result.next()) {
						
						System.out.println("Name: "+result.getString("Name") + ", country code: "
								+ result.getString("CountryCode") + ", distric: "
								+ result.getString("District") + ", population: "
								+ result.getString("Population"));
					}
					break;
				}
				case 3: {
					System.out.println("Enter a continent name:");
					String continent = uInput.next().toUpperCase();
					query = "SELECT * from country where continent = '"
							+ continent + "';";
					ResultSet result = statement.executeQuery(query);
					
					if (!result.next()) {
						System.out.println("Wrong input or query not found");
					}
					// prints the countries in that continent
					while (result.next()) {
						System.out.println("Name: "+result.getString("Name") + ", Region: "
								+ result.getString("Region"));
					}
					break;
				}
				case 4: {
					query = "SELECT * from country order by Population desc limit 10;";
					ResultSet result = statement.executeQuery(query);
					System.out.println("Name, Population: ");
					// prints the top 10 populated countries
					while (result.next()) {
						System.out.println(result.getString("Name") + ", "
								+ result.getString("Population"));
					}
					break;
				}
				case 5: {
					query = "SELECT * from city order by Population desc limit 10;";
					ResultSet result = statement.executeQuery(query);
					System.out.println("Name, Population: ");
					// prints the top 10 populated cities
					while (result.next()) {
						System.out.println(result.getString("Name") + ", "
								+ result.getString("Population"));
					}
					break;
				}
				case 6: {
					System.out.println("Enter the first letter:");
					String letter = uInput.next();
					// query to search the database by first letter
					query = "SELECT * from country where name like '"
							+ letter.charAt(0) + "%';";
					ResultSet result = statement.executeQuery(query);
					System.out.println("Name, Continent, Population: ");
					if (!result.next()) {
						System.out.println("Wrong input or query not found");
					}
					// prints it
					while (result.next()) {
						System.out.println(result.getString("Name") + ", "
								+ result.getString("Continent") + ", "
								+ result.getString("Population"));
					}
					break;
				}

				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input, try again");
				uInput.nextLine();
			} catch (SQLException ey) {
				System.out.println("Something went wrong, try again:");
				uInput.nextLine();
			}
		}
		uInput.close();
	}

}
