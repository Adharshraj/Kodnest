package Arrays;

import java.util.Arrays;
import java.util.List;

public class newa {

	public static void main(String[] args) {
		String[] colors = {"red", "green", "blue"};
		List<String> colorList = Arrays.asList(colors);
		
		List<String> colorList1 = Arrays.asList("red", "green", "blue");
		String[] colors1 = colorList.toArray(new String[0]);



	}

}
