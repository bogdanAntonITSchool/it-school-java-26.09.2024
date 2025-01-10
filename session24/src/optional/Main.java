package optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Integer i = computeValue(-1);
        if (i != null) {
            System.out.println(i);
        } else {
            System.out.println("Value is null");
        }

        // Optional is a container object used to contain not-null or nullable values
        Optional.ofNullable(computeValue(-1))
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Value is null")
                );

        Optional<Integer> i1 = Optional.ofNullable(computeValue(-1));
        i1.ifPresent(System.out::println);

        System.out.println(i1.orElse(0));
    }

    private static Integer computeValue(int x) {
        return x > 0
                ? x / 2
                : null;
    }
}
