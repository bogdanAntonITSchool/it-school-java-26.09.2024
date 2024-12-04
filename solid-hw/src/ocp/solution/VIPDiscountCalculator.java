package ocp.solution;

import ocp.solution.abstr.AbstractDiscountCalculator;

public class VIPDiscountCalculator extends AbstractDiscountCalculator {

    @Override
    public double calculateDiscount(double price) {
        return price * .1;
    }
}
