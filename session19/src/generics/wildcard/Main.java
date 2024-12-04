package generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Number> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(sum(numbers));

        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        System.out.println(sum(integers));

        // The wildcard ? super A means that the method can accept a List of any type that is a superclass of A.
        List<? super A> list = new ArrayList<>();

        list.add(new A());
        list.add(new B());
        list.add(new C());

    }

    // The wildcard ? extends Number means that the method can accept a List of any type that is a subclass of Number.
    public static double sum(List<? extends Number> numbers) {
        double sum = 0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

}


class A {}
class B extends A {}
class C extends B {}
