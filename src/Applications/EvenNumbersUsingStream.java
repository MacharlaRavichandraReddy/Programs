package Applications;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersUsingStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 2, 9, 1, 5, 6);

        // Filter out even numbers using the Stream API
        List<Integer> evenNumbers = integerList.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}

