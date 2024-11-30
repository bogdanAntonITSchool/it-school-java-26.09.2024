package dip.service;

import dip.model.base.Shape;

/**
 * This class is used to compute the area of a shape.
 * This class follows the Dependency Inversion Principle as it depends on abstractions (Shape) not on concrete implementations.
 */
public class AreaComputer {

    private final Shape shape;

    public AreaComputer(Shape shape) {
        this.shape = shape;
    }

    public double computeArea() {
        return shape.computeArea();
    }

}
