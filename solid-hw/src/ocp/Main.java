package ocp;

import ocp.solution.StudentDiscountCalculator;
import ocp.solution.abstr.AbstractDiscountCalculator;

/**
 * Refactor the DiscountCalculator class to follow OCP using interfaces or abstract classes.
 * Add a new customer type (e.g., "Student") without modifying the existing logic.
 */
public class Main {

    public static void main(String[] args) {

        AbstractDiscountCalculator studentCalculator = new StudentDiscountCalculator();
        System.out.println("The price for a student is: " + studentCalculator.calculateDiscount(100));

    }

}
