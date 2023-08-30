package Applications;
import java.util.Arrays;
import java.util.List;

public class FindFirstElementUsingStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 2, 9, 1, 5, 6);

        // Find the first element using the Stream API
        Integer firstElement = integerList.stream()
                .findFirst()
                .orElse(null); // Default value if the list is empty

        if (firstElement != null) {
            System.out.println("First element: " + firstElement);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
