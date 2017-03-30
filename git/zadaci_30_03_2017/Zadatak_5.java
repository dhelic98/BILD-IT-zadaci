package zadaci_14_03_2017;

public class Zadatak_5 {

	public static void main(String[] args) throws CloneNotSupportedException {
		/*
		 * Revise the MyStack class) Rewrite the MyStack class in Listing 11.10
		 * to perform a deep copy of the list field.
		 */

		MyStack stack1 = new MyStack();

		// Push objects on to stack1
		System.out.println("Pushing 3 numbers into 1st stack");
		stack1.push(new Integer(7));
		stack1.push(new Integer(6));
		stack1.push(new Integer(5));

		// Clone stack1 and assign the clone to stack2
		System.out.println("Cloning 1st stack");
		MyStack stack2 = (MyStack) stack1.clone();

		// Pop an object from stack1
		System.out.println("Popping object from 1st stack");
		stack1.pop();

		// Display results
		System.out.print("1st ");
		System.out.println(stack1);
		System.out.print("2nd ");
		System.out.println(stack2);
		System.out.println("Is the 1st stack equal to the 2nd? "
				+ (stack1 == stack2));

	}

}
