package recap.function;


import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        Consumer<String> oldConsumer = Main::consumeString;

        oldConsumer.accept("Hello, World!");
        oldConsumer.accept("Hi!");

        // BiConsumer<String, Integer> otherConsumer = (s, i) -> System.out.println("String: " + s + " Integer: " + i);
        BiConsumer<String, Integer> otherConsumer = Main::consumeElements;

        otherConsumer.accept("Hello, World!", 5);

        Predicate<String> containsE = s -> s.contains("e");
        Predicate<String> containsA = s -> s.contains("a");

        System.out.println(containsE.test("Hello") ? "Contains e" : "Does not contain e");
        System.out.println(containsE.test("Salut") ? "Contains e" : "Does not contain e");

        System.out.println(containsE.and(containsA).test("Helloa")
                ? "Contains e and a"
                : "Does not contain e and a");

        Supplier<Book> bookSupplier = () -> new Book("Test", "Test", 100);

        Book book = bookSupplier.get();

        int count = 0;
        Supplier<Book> otherBookSupplier = () -> new Book("Test" + count, "Test", 100);

        Book otherBook = otherBookSupplier.get();

        Function<String, Integer> getLength = String::length;

        Integer apply = getLength.apply("Hello, World!");
        System.out.println(apply);

        UnaryOperator<String> toLowerCase = String::toLowerCase;

        String apply1 = toLowerCase.apply("HELLO, WORLD!");
        System.out.println(apply1);

        SomeService someService = new SomeService();
        Consumer<String> someMethodConsumer = someService::someMethod;

        Supplier<Book> bookSupplierNew = Book::new;
        Book book1 = bookSupplierNew.get();

    }

    public static void consumeString(String s) {
        if (s != null && s.length() > 5) {
            System.out.println(s);
        } else {
            System.out.println("String is null or too short");
        }
    }

    public static void consumeElements(String s, Integer i) {
        System.out.println("String: " + s + " Integer: " + i);
    }

}

class SomeService {
    public void someMethod(String s) {
        System.out.println("Some method: " + s);
    }
}

class Book {

    private final String author;
    private final String title;
    private final long pages;

    Book() {
        this.author = "Unknown";
        this.title = "Unknown";
        this.pages = 0;
    }

    Book(String author, String title, long pages) {
        this.author = author;
        this.title = title;
        this.pages = pages;
    }
}
