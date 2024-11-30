package lsp;

import java.util.List;

/**
 * The Liskov Substitution Principle states that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application.
 * In the following example you can see a class hierarchy that respects the Liskov Substitution Principle.
 * <p>
 * The Shape class is the superclass and has two subclasses: ShapeWithArea and ShapeWithoutArea.
 * The ShapeWithArea interface has a method that computes the area of the shape.
 * The ShapeWithoutArea interface has a method that draws the shape.
 * <p>
 * The Circle class is a subclass of ShapeWithArea and implements the computeArea method.
 * The Dot class is a subclass of ShapeWithoutArea and implements the draw method.
 * <p>
 * By following the Liskov Substitution Principle, we can create a list of shapes and iterate over them,
 * calling the 'commonBehavior' method on each shape. The 'commonBehavior' method is defined in the Shape class and is inherited by all subclasses, making sure that it doesn't throw any exception.
 */
public class Main {

    public static void main(String[] args) {

//        Shape circle = new Circle(5);
//        Shape dot = new Dot();
//
//        List<Shape> shapes = List.of(circle, dot);
//
//        for (Shape shape : shapes) {
//            System.out.println(shape.computeArea());
//        }
//
//        ShapeWithArea shape = new Circle(5);
//
//        shape.computeArea();
//
//        shape = new Dot();
//
//        shape.computeArea();

        Shape circle = new Circle(5);
        Shape dot = new Dot();

        List<Shape> shapes = List.of(circle, dot);

        for (Shape shape : shapes) {
            shape.commonBehavior();

            if (shape instanceof ShapeWithArea shapeWithArea) {
                System.out.println("Area: " + shapeWithArea.computeArea());
            }

            if (shape instanceof ShapeWithoutArea shapeWithoutArea) {
                shapeWithoutArea.draw();
            }
        }

    }

    //                 Shape
    //                  /  \
    //     ShapeWithArea   ShapeWithoutArea
    //         /  \                |
    //    Circle  Triangle        Dot

}
