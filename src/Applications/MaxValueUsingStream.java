package Applications;
import java.util.Arrays;
import java.util.List;

public class MaxValueUsingStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 2, 9, 1, 5, 6);

        // Find the maximum value using the Stream API
        int maxValue = integerList.stream()
                .mapToInt(Integer::intValue)
                .max()
                .orElse(Integer.MIN_VALUE);

        System.out.println("Maximum value: " + maxValue);
    }
}

