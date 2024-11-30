package ocp;

public class DiscountCalculator {

    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("Regular")) {
            return price * 0.05;
        } else if (customerType.equals("VIP")) {
            return price * 0.1;
        }
        return 0;
    }

}
