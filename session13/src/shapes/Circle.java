package shapes;

public class Circle extends Shape {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();

        sb.append("Circle Details\n");
        sb.append("Color: ")
                .append(this.getColor())
                .append("\n");
        sb.append("Radius: ")
                .append(this.radius)
                .append("\n");

        return sb.toString();
    }
}
