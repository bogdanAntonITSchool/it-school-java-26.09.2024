package ocp.solution;

import ocp.solution.abstr.AbstractDiscountCalculator;

public class StudentDiscountCalculator extends AbstractDiscountCalculator {

    @Override
    public double calculateDiscount(double price) {
        return price * .08;
    }

}
