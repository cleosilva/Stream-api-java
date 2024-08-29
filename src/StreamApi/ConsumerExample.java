package StreamApi;

import java.util.Arrays;
import java.util.List;

/**
 * Represents an operation that accepts an argument of type T and does not return any result.
 * It is mainly used to perform actions or side effects on the elements of the Stream without
 * modifying or returning a value.
 */

public class ConsumerExample {
    public static void main(String[] args) {
    // Create an integers numbers list
    List<Integer> numbers = Arrays.asList(1,2,3,4,5);

    // Use Consumer to print even number in the Stream
    numbers.stream().filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
