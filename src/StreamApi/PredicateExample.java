package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Represents a function that accepts an argument of type T and returns a boolean value (true or false).
 * It is commonly used to filter the elements of the Stream based on some condition.
 */

public class PredicateExample {
    public static void main(String[] args) {
        // Create a word list
        List<String> words = Arrays.asList("java", "klotin", "python", "javascript", "c", "go", "ruby");

        // Create a Predicate that checks if the word has more than 5 characters
        Predicate<String> moreThanFiveCharacters = word -> word.length() > 5;

        // Use Stream to filter out words that are longer than 5 characters, then
        // print each filtered word
        words.stream()
                .filter(word -> word.length() > 5)
                .forEach(System.out::println);
    }
}
