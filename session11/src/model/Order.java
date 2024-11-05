package model;

public class Order {

    private static int orderCount = 0;

    // instance fields
    private int id; // by default 0
    private String customerName; // by default null
    private String productName; // by default null
    private int quantity; // by default 0
    private double price; // by default 0.0
    private double total; // by default 0.0

    // constructors
    // 'total' is not passed as an argument. It is calculated based on quantity and price.
    // 'id' is automatically generated and incremented by 1 for each new order.
    public Order(String customerName,
                 String productName,
                 int quantity,
                 double price) {
        orderCount++;

        this.id = orderCount;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;

        // calculate total
        this.total = quantity * price;
    }

    public Order() {
        this("John Doe", "Product", 0, 0.0);
    }

    // instance methods
    public void printDetails() {
        System.out.println("--- Order details ---");
        System.out.println("Order id: " + id);
        System.out.println("Customer name: " + customerName);
        System.out.println("Product name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Total: " + total);
        System.out.println("---------------------");
    }

    // getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
