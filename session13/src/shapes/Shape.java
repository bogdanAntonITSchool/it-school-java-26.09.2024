package shapes;

public abstract class Shape {

    private String color;

    protected Shape(String color) {
        this.color = color;
    }

    protected abstract double area();
    protected abstract String getDetails();

    public String getColor() {
        return this.color;
    }
}
