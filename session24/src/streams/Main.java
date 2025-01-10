package streams;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> strings = List.of("one", "two", "three", "four", "five", "one");

        UnaryOperator<String> toUpperCase = String::toUpperCase;

        // Streams are a sequence of elements supporting sequential and parallel aggregate operations
        // by using functional-style operations

        // Applying .stream() to a collection will return a stream of the collection's elements
        Stream<String> stream = strings.stream();

        // There are two types of operations in streams:
        // - intermediate operations: return a new stream
        // - terminal operations: return a result

        // Intermediate operations:
        Stream<String> stringStream = stream.filter(s -> s.length() > 3);
        Stream<String> stringStream1 = stringStream.filter(s -> s.length() < 5);
        Stream<String> stringStream2 = stringStream1.map(toUpperCase);

        // Terminal operations:
        List<String> list = stringStream2.toList();

        // The above code can be written in a chain:
        List<String> notThatLongStrings = strings.stream()
                .filter(s -> s.length() > 3)
                .filter(s -> s.length() < 5)
                .map(toUpperCase)
                .toList();

        System.out.println(notThatLongStrings);
        System.out.println("-----------------");

        strings.stream()
                .filter(s -> s.length() > 3)
                .filter(s -> s.length() < 5)
                .map(toUpperCase)
                .forEach(s -> System.out.println("Element: " + s));

        System.out.println("-----------------");

        List<List<String>> stringInString = List.of(
                List.of("one", "two", "three"),
                List.of("four", "five", "six")
        );

        // [[one, two, three], [four, five, six]]
        // becomes
        // [one, two, three, four, five, six]

        stringInString.stream()
                .flatMap(Collection::stream)
                .filter(s -> s.length() > 3)
                .filter(s -> s.length() < 5)
                .map(toUpperCase)
                .forEach(s -> System.out.println("Element: " + s));

        List<String> distinct = strings.stream()
                .distinct()
                .toList();

        System.out.println(distinct);

        List<Book> books = List.of(
                new Book("Author1", 300),
                new Book("Author2", 600),
                new Book("Author1", 300)
        );

        List<Book> distinctBooks = books.stream()
                .distinct()
                .toList();

        System.out.println(distinctBooks);

        List<Book> sortedBooks = books.stream()
                // VAR 1
//                .sorted(new Comparator<Book>() {
//                    @Override
//                    public int compare(Book o1, Book o2) {
//                        return Long.compare(o1.getPages(), o2.getPages());
//                    }
//                })
                // VAR 2
//                .sorted((o1, o2) -> Long.compare(o1.getPages(), o2.getPages()))
                // VAR 3
                .sorted(Comparator.comparingLong(Book::getPages))
                .toList();

        System.out.println(sortedBooks);


        Stream<String> stream1 = List.of("elem").stream();

        List<String> list1 = stream1.toList();

        // Stream is closed
        // Object[] array = stream1.filter(s -> s.length() > 3)
        //        .toArray();

        List<Integer> ints = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer sum = ints.stream()
                .filter(i -> i % 2 == 0)
                //.reduce((a, b) -> a + b);
                //.reduce(Integer::sum);
                .reduce(0, Integer::sum);

        System.out.println(sum);

        Optional<Integer> min = ints.stream()
                .filter(i -> i % 2 == 1)
                .min(Comparator.comparingInt(o -> o));


        List<String> names = List.of("John", "Paul", "George", "Ringo");
        boolean containsO = names.stream()
                .filter(s -> s.length() > 4)
                .allMatch(s -> s.contains("o"));

        System.out.println(containsO);

        Optional<String> first = names.stream()
                .filter(s -> s.length() > 3)
                .findAny();

        System.out.println(first.orElse("No name found"));

        Set<String> setNames = Set.of("John", "Paul", "George", "Ringo");

        Optional<String> firstSet = setNames.stream()
                .filter(s -> s.length() > 3)
                .findAny();

        System.out.println(firstSet.orElse("No name found"));
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, pages);
    }

}
