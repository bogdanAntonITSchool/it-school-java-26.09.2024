package abstrpoly;

public abstract class Shape implements Drawable {

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void printDetails();

    public void parentMethod() {
        System.out.println("Parent method");
    }
}
