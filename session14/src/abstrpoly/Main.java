package abstrpoly;

public class Main {

    public static void main(String[] args) {
        // The old way, without polymorphism

        // Circle circle = new Circle(5);
        // Rectangle rectangle = new Rectangle(5, 10);

        // The new way, with polymorphism

        // upcasting
        Shape circleShape = new Circle(5);
        Shape rectangleShape = new Rectangle(5, 10);

        double circleArea = circleShape.getArea();
        double circlePerimeter = circleShape.getPerimeter();

        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle perimeter: " + circlePerimeter);
        circleShape.printDetails();

        double rectangleArea = rectangleShape.getArea();
        double rectanglePerimeter = rectangleShape.getPerimeter();

        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);
        rectangleShape.printDetails();

        System.out.println("--------------------");
        Shape[] shapes = new Shape[5];

        // basic for loop
        for (int i = 0; i < shapes.length; i++) {
            if (i % 2 == 0) {
                shapes[i] = new Circle(i + 1);
            } else {
                shapes[i] = new Rectangle(i + 1, i + 2);
            }
        }

        // enhanced for loop
        for (Shape shape : shapes) {
            shape.printDetails();
        }

        System.out.println("--------------------");
        Drawable[] drawables = new Drawable[5];

        for (int i = 0; i < drawables.length; i++) {
            if (i % 2 == 0) {
                drawables[i] = new Circle(i + 1);
            } else {
                drawables[i] = new Landscape();
            }
        }

        for (Drawable drawable : drawables) {
            drawable.draw();
        }

        Circle circle = new Circle(5);
        circle.circleMethod();

        Shape genericShape = new Circle(5);
        // only the methods in the Shape class are available
        // genericShape.circleMethod();
        genericShape.parentMethod();

        genericShape = new Rectangle(5, 10);
        ((Rectangle) genericShape).rectangleMethod();

        int x = 10;
        double d = x;

        x = (int) d;

        long l = 1000000000000000000L;
        int y = (int) l;

        System.out.println(y);

        // these both will compile, as genericShape is a Shape object
        // This will throw a ClassCastException at runtime, as genericShape is a Rectangle object
        // ((Circle) genericShape).circleMethod();
        ((Rectangle) genericShape).rectangleMethod();
        ((Rectangle) genericShape).secondRectangleMethod();

        Rectangle rectl = new Rectangle(5, 10);

        // won't compile, as rectl is a Rectangle object and not a Circle object
        // ((Circle) rectl).circleMethod();

        Rectangle rectangle = (Rectangle) genericShape;

        rectangle.rectangleMethod();
        rectangle.secondRectangleMethod();

        // genericShape.rectangleMethod();

        Rectangle rectangleSecond = (Rectangle) genericShape;

        if (rectangle == rectangleSecond) {
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

    }


    //                   Drawable (interface)
    //                    /    \
    //            Landscape     Shape (abstract class)
    //                          /    \
    //                      Circle  Rectangle
}
