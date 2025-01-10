package functionalinterfaces;

import java.time.LocalDateTime;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        // the jdk already provides a couple of functional interfaces that usually
        // cover most of the use cases

        // Consumer<T> - represents an operation that accepts a single input argument and returns no result
        Consumer<String> shapeDrawer = s -> System.out.println("Drawing a " + s);

        shapeDrawer.accept("circle");
        shapeDrawer.accept("square");

        // Function<T, R> - represents a function that accepts one argument and produces a result
        Function<String, Integer> stringToIntFun = s -> Integer.valueOf(s);

        Integer convertedInt = stringToIntFun.apply("123");
        System.out.println(convertedInt);

        // Predicate<T> - represents a predicate (boolean-valued function) of one argument
        Predicate<Book> isLongBook = book -> book.getPages() > 500;

        Book book1 = new Book("Author1", 300);
        Book book2 = new Book("Author2", 600);

        List<Book> books = List.of(book1, book2);

        for (Book book : books) {
            if (isLongBook.test(book)) {
                System.out.println("Book " + book + " is long");
            } else {
                System.out.println("Book " + book + " is not long");
            }
        }

        // Supplier<T> - represents a supplier of results
        Supplier<String> stringSupplier = () -> "Hello, World!";
        Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();

        // The operators are special cases of functions
        // UnaryOperator<T> - represents an operation on a single operand that produces a result of the same type as its operand
        UnaryOperator<Integer> square = i -> i * i;
        // BinaryOperator<T> - represents an operation upon two operands of the same type, producing a result of the same type as the operands
        BinaryOperator<Integer> sum = (a, b) -> a + b;

        Integer apply = square.apply(3);
        System.out.println(apply);

        Integer apply1 = sum.apply(3, 4);
        System.out.println(apply1);
    }

}

class Book {
    private final String author;
    private final long pages;

    public Book(String author, long pages) {
        this.author = author;
        this.pages = pages;
    }

    public long getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}
