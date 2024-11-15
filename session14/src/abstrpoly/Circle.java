package abstrpoly;

public class Circle extends Shape {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printDetails() {
        System.out.println("Circle radius: " + radius);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }

    public void circleMethod() {
        System.out.println("Circle method");
    }

    @Override
    public void parentMethod() {
        System.out.println("Child method");
    }
}
