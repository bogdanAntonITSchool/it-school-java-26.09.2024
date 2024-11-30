package dip;

import dip.model.Circle;
import dip.model.Rectangle;
import dip.model.base.Shape;
import dip.service.AreaComputer;

public class Main {

    public static void main(String[] args) {

        Shape rectangle = new Rectangle(10, 20);
        Shape circle = new Circle(10);

        AreaComputer rectangleAreaComputer = new AreaComputer(rectangle);
        AreaComputer circleAreaComputer = new AreaComputer(circle);

        System.out.println("Rectangle area: " + rectangleAreaComputer.computeArea());
        System.out.println("Circle area: " + circleAreaComputer.computeArea());

    }

}
