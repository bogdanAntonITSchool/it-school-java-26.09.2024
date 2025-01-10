package methodreference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Consumer<String> oldConsumer = s -> System.out.println(s);

        // method reference are used to simplify lambda expressions
        // it can be used when:
        // - the lambda expression is calling a method that already exists
        // - the lambda expression is calling a constructor
        // - the lambda expression is calling a static method
        Consumer<String> newConsumer = System.out::println;

        String baseString = "Hello, ";
        Function<String, String> someConcat = baseString::concat;

        String apply = someConcat.apply("World!");
        System.out.println(apply);

        // example of a method reference to a static method
        Predicate<Integer> isEven = Main::isEven;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
