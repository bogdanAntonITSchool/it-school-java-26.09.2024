package abstrpoly;

public class Rectangle extends Shape {

    private final double width;
    private final double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void printDetails() {
        System.out.println("Rectangle width: " + width + ", length: " + length);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }

    @Override
    public void parentMethod() {
        System.out.println("I am in a rectangle object!");
    }

    public void rectangleMethod() {
        System.out.println("Rectangle method");
    }

    public void secondRectangleMethod() {
        System.out.println("Second rectangle method");
    }
}
