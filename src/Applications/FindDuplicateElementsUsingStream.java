package Applications;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElementsUsingStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 2, 9, 1, 5, 6, 9, 3);

        // Find duplicate elements using the Stream API
        Map<Integer, Long> frequencyMap = integerList.stream()
                .collect(Collectors.groupingBy(number -> number, Collectors.counting()));

        List<Integer> duplicateNumbers = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate numbers: " + duplicateNumbers);
    }
}


