package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Represents a function that accepts an argument of type T and returns a result of type R.
 * It is used to transform or map the elements of the Stream into other values or types.
 */

public class FunctionExample {
    public static void main(String[] args) {
        // Create an integers numbers list
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // Use a function with lambda expression to double all the numbers
        Function<Integer, Integer> toDouble = number -> number * 2;

        // Use a function to double all the numbers in Stream and storage them in another list.
        List<Integer> doubleNumbers = numbers.stream()
                .map(n -> n * 2)
                .toList();

        // Print the double numbers list
        doubleNumbers.forEach(System.out::println);
    }
}
