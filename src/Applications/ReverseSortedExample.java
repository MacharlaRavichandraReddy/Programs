package Applications;

import java.util.Arrays;
import java.util.Collections;

public class ReverseSortedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 5, 2, 9, 1, 5, 6 };

        // Sorting the array in ascending order
        Arrays.sort(arr);

        // Reversing the sorted array to get descending order
        Collections.reverse(Arrays.asList(arr));

        // Printing the reverse sorted array
        System.out.println("Reverse sorted array: " + Arrays.toString(arr));
    






	}

}
