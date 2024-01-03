package Arrays;

import java.util.Arrays;

public class Copy {

	public static void main(String[] args) {
		int[] source = {1, 2, 3, 4, 5};
		int[] copy = Arrays.copyOf(source, 3);
		System.out.println(Arrays.toString(copy)); // [1, 2, 3]

	}

}
