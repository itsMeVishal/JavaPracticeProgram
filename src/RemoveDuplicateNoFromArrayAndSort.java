import java.util.List;

import org.junit.Test;

import java.util.Arrays;

public class RemoveDuplicateNoFromArrayAndSort {

	public static int[] operate(int[] arr) {
		
		List<int[]> content = Arrays.asList(arr);
		System.out.println(content);
		return arr;
	}

	@Test
	public void RemoveDuplicateNoFromArrayAndSortTest() {
	  int[] temp = {1,2,3,4,1};
	  operate(temp);
	}
}
