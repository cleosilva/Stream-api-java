package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Create a integers numbers list
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // Use BinaryOperator with lambda expression to add 2 integers
        BinaryOperator<Integer> sum = (n1, n2) -> n1 + n2; //

        // Use BinaryOperation to sum all numbers in the Stream
        int result = numbers.stream()
                .reduce(0, Integer::sum);

        // Print result
        System.out.println("The sum of the numbers is " + result);
    }
}
