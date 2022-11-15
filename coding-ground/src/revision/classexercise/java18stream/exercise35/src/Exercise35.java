package revision.classexercise.java18stream.exercise35.src;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.*;

/**
 * Exercise: Follow the instruction to complete the code, in order to generate the output.
 */
/**
 * Expected Output
 * [144, 169, 196, 225]
 * [Stream]
 * [Collection, Reflection, Stream]
 * [Stream, Reflection, Collection]
 * Square Set: [16, 36, 25]
 * The Square of each elements:
 * 25
 * 16
 * 25
 * 36
 * The sum is: 10
 */
class Exercise35 {
    public static void main(String args[]) {

        // create a list of integers
        List<Integer> numbers = Arrays.asList(12, 13, 14, 15);
        // Revise each of integer elements to become square of itself, and store it in
        // another ArrayList
        // Code here ...
        List<Integer> squares = new ArrayList<>();
        numbers.forEach(e -> {
            squares.add(e * e);
        });
        System.out.println(squares);

        // create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        // Filter those elements start with "S" to another list of String, and print it
        // out
        // Code here ...
        Predicate<String> startWithS = e -> e.startsWith("S");
        List<String> filteredList = names.stream()
                .filter(startWithS)
                .collect(Collectors.toList());
        System.out.println(filteredList);

        // Sorts the ArraryList by using stream sorting method by natual order in JVM
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);
        // Do you remember Comparator? Use Lambda expression to implement sorted()
        // method
        // To print REVERSE order of ArrayList names, [Stream, Reflection, Collection]
        // Code here ...
        Comparator<String> reverse = (x, y) -> y.compareTo(x);
        sortedNames = sortedNames.stream().sorted(reverse).collect(Collectors.toList());
        System.out.println(sortedNames);

        // create a list of integers
        List<Integer> anotherNumbers = Arrays.asList(5, 4, 5, 6);
        // Return the square of elements
        // What Data Structure stores unquie elements ONLY? Use it to remove duplicated
        // element(s)
        // // Code here ...
        UnaryOperator<Integer> square = e -> e * e;
        Set<Integer> squareSet = anotherNumbers.stream()
                .map(square)
                .collect(Collectors.toSet());
        System.out.println("Square Set: " + squareSet);

        // Use stream forEach method to print square of each Integer in ArrayList
        // anotherNumbers
        System.out.println("The Square of each elements: ");
        // Code here ...
        Consumer<Integer> printSquare = e -> System.out.println(e * e);
        anotherNumbers.forEach(printSquare);
        // Implement stream reduce() method to sum up all even numbers from ArrayList
        // anotherNumbers
        // By using lambda expression
        // Code here ...
        BinaryOperator<Integer> sumEven = (x, y) -> {
            if (x % 2 == 1) {
                return y;
            }
            if (y % 2 == 1) {
                return x;
            }
            return x + y;
        };
        anotherNumbers.stream().reduce(sumEven).ifPresent(e -> System.out.println("The sum is: " + e));
    }
}
