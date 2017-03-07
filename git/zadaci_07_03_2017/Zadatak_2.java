package zadaci_07_03_2017;

public class Zadatak_2 {

	public static void main(String[] args) {
		/*
		 * (The Person, Student, Employee, Faculty, and Staff classes) Design a
		 * class named Person and its two subclasses named Student and Employee.
		 * Make Faculty and Staff subclasses of Employee. A person has a name,
		 * address, phone number, and email address. A student has a class
		 * status (freshman, sophomore, junior, or senior). Define the status as
		 * a constant. An employee has an office, salary, and date hired. Use
		 * the MyDate class defined in Programming Exercise 10.14 to create an
		 * object for date hired. A faculty member has office hours and a rank.
		 * A staff member has a title. Override the toString method in each
		 * class to display the class name and the person’s name. Draw the UML
		 * diagram for the classes and implement them. Write a test program that
		 * creates a Person, Student, Employee, Faculty, and Staff, and invokes
		 * their toString() methods.
		 */
		// Creating objects
		Person person = new Person("Dzenan Helic", "062880321", "Ciris bb",
				"dhelic.98@hotmail.com");

		Student student = new Student("Hazim", "06644321323", "ASasa bb",
				"hazim@hazim.com", 3);

		Employee employee = new Employee("Meho", "34 West street", "061234567",
				"meho80@adasda.com", 422, 30000);

		Faculty faculty = new Faculty("Suad", "Stjepan Polje bb", "062444777",
				"suad28@mail.com", 101, 50000, "13:00 do 19:20", "Profesor");

		Staff staff = new Staff("Bill", "90 Country road", "2030000000",
				"bill@mail.com", 12, 65000, "Executive Assistant");

		// Printing out information
		System.out.println(person.toString());
		System.out.println(student.toString());
		System.out.println(employee.toString());
		System.out.println(faculty.toString());
		System.out.println(staff.toString());

	}

}
