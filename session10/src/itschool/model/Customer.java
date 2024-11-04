package itschool.model;

public class Customer {

    private String name;
    private String address;
    private String email;

    public Customer(String address, String email) {
        this();
        this.address = address;
        this.email = email;
    }

    private Customer() {
        this.name = "John Doe";
    }

    public void printCustomerInfo() {
        System.out.println("Customer name: " + name);
        System.out.println("Customer address: " + address);
        System.out.println("Customer email: " + email);
    }
}
