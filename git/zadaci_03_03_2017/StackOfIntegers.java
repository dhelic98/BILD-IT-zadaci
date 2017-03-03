package zadaci_03_03_2017;

import java.util.ArrayList;

import java.util.Collections;

public class StackOfIntegers {
	private ArrayList<Integer> list;
	private int size;

	/** Construct a stack with the default capacity 16 */
	public StackOfIntegers() {
		list = new ArrayList<>();
		size = list.size();
	}

	// Adding ints to arrayList
	public void add(int value) {
		this.list.add(value);
		Collections.sort(list);
		Collections.reverse(list);
	}

	// Printing out result
	public void print() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + ", ");
		}
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}
}
