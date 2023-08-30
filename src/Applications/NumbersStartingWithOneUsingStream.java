package Applications;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithOneUsingStream {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 23, 15, 102, 188, 198);

        // Filter out numbers starting with 1 using the Stream API
        List<Integer> numbersStartingWithOne = integerList.stream()
                .filter(number -> String.valueOf(number).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + numbersStartingWithOne);
    }
}

