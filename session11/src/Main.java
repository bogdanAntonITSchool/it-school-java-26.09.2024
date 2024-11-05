import model.Order;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.printDetails();

        Order orderWithDetails =
                new Order("David", "Laptop", 2, 1000.0);
        orderWithDetails.printDetails();

        // The values returned by the getters are copies of the original values.
        // The original values are not changed.
        String customerName = orderWithDetails.getCustomerName();
        customerName = "Bogdan";

        // The original values are unchanged.
        orderWithDetails.printDetails();

        // Changing the original values using the setters.
        orderWithDetails.setCustomerName("Bogdan");

        // The original values are changed.
        orderWithDetails.printDetails();
    }
}