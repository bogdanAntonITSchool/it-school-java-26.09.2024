package lsp;

public class Circle extends ShapeWithArea{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void commonBehavior() {
        System.out.println("Common behavior of Circle");
    }
}
