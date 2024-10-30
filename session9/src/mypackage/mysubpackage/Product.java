package mypackage.mysubpackage;

public class Product {

    double price;

    // This field is private and can only be accessed within the class
    private String name;

    // This is a method calling a private method
    public void printDetails() {
        System.out.println("Price: " + price);
        if (name != null) {
            printName();
        }
    }

    // This is also a setter method, but it has a condition
    /*
    void setPrice(double p) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
        } else {
            price = p;
        }
        printName();
    }
     */

    // This is a private method and can only be accessed within the class
    private void printName() {
        System.out.println("Name: " + name);
    }

    // This is a getter method
    public double getPrice() {
        return price;
    }

    // This is a setter method
    public void setPrice(double p) {
        price = p;
    }
}
