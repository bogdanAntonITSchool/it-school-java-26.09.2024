package shapes;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return this.length * this.width;
    }

    @Override
    public String getDetails() {
        StringBuilder sb = new StringBuilder();

        sb.append("Rectangle Details\n");
        sb.append("Color: ")
                .append(this.getColor())
                .append("\n");
        sb.append("Length: ")
                .append(this.length)
                .append("\n");
        sb.append("Width: ")
                .append(this.width)
                .append("\n");

        return sb.toString();
    }
}
