package lambda;

public class LambdaMain {

    public static void main(String[] args) {
        Drawable oldShapeDrawer = new Drawable() {
            @Override
            public void draw(String shape) {
                System.out.println("Drawing a " + shape);
            }
        };

        Drawable shapeDrawer = shape -> System.out.println("Drawing a " + shape);

        shapeDrawer.draw("circle");
        shapeDrawer.draw("square");

        ConcreteDrawer concreteDrawer = new ConcreteDrawer();
        concreteDrawer.draw("triangle");

        // we can have multiple lines of code in a lambda expression
        // but we need to use curly braces and return statement if we want to return a value
        Drawable instance = s -> {
            System.out.println("Drawing a " + s);
            System.out.println("salut");
        };

        String hello = instance.hello();
        System.out.println(hello);
        instance.draw("rectangle");

        // the lambda expression number of parameters and the type of parameters must match the interface
        Computable add = (a, b) -> a + b;
        Computable multiply = (a, b) -> a * b;

        int sum = add.compute(3, 4);
        int multiplication = multiply.compute(3, 4);

        System.out.println(sum);
        System.out.println(multiplication);

        // we can also use lambda expressions with multiple parameters
        Computable subtract = (a, b) -> {
            System.out.println("Subtracting " + a + " from " + b);
            return a - b;
        };

        subtract.compute(3, 4);
    }

}

interface Computable {
    int compute(int a, int b);
}

@FunctionalInterface
interface Drawable {
    void draw(String shape);

    default String hello() {
        return "Hello";
    }
}

class ConcreteDrawer implements Drawable {
    @Override
    public void draw(String shape) {
        System.out.println("Drawing a " + shape);
    }
}