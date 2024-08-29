package StreamApi;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Represents an operation that accepts no arguments and returns a result of type T.
 * It is commonly used to create or provide new objects of a given type.
 */

public class SupplierExample {
    public static void main(String[] args) {
        // Use Supplier with lambda expression to provide a customized greeting
        Supplier<String> greeting = () -> "Hi, welcome!";

        // Use Supplier to get a list with 5 greeting
        List<String> greetingList = Stream.generate(() -> "Hi, welcome with lambda!")
                .limit(5)
                .toList();

        // Print the generated greeting
        greetingList.forEach(System.out::println);
    }
}
