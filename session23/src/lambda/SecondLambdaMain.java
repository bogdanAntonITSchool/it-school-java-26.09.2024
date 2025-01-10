package lambda;

import java.util.function.Consumer;

public class SecondLambdaMain {

    // final means that the variable is a constant and cannot be changed;
    // effectively final means that the variable is not changed;
    public static void main(String[] args) {
        int x = 10;
        int y = 15;

        Consumer<Integer> integerConsumer = i -> {
            System.out.println("Here are x and y:" + x + " " + y);
            System.out.println("The sum is: " + (x + y + i));
        };

        integerConsumer.accept(5);
    }
}
