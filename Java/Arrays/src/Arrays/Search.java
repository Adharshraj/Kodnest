package Arrays;

import java.util.Arrays;

public class Search {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 5, 5, 9};
		int index = Arrays.binarySearch(numbers, 5);
		System.out.println("Index of 5: " + index); 


	}

}
