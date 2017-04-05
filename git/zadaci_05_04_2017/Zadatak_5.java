package zadaci_05_04_2017;

public class Zadatak_5 {

	public static void main(String[] args) {
		/*
		 * Generic binary search) Implement the following method using binary
		 * search. public static <E extends Comparable<E>> int binarySearch(E[]
		 * list, E key)
		 */

		// Testing method
		Integer[] listOfIntegers = { 1, 2, 3, 4, 5, 6, 7 };

		if (isListSorted(listOfIntegers))
			System.out.println(binarySearch(listOfIntegers, 2));
		else
			System.out.println("List is not sorted.");

	}

	public static <E extends Comparable<E>> boolean isListSorted(E[] list) {

		// Method for checking if list is sorted
		for (int i = 0; i < list.length - 1; i++) {
			if (list[i].compareTo(list[i + 1]) > 0) {
				return false;
			}
		}
		return true;
	}

	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {
		// Method for binary search
		int low = 0;
		int high = list.length - 1;
		// 1, 2, 3, 4, 5, 6, 7
		while (low <= high) {
			int mid = (low + high) / 2;

			if (list[mid].compareTo(key) == 0)
				return mid;
			else if (list[mid].compareTo(key) > 0)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -low - 1;
	}

}
