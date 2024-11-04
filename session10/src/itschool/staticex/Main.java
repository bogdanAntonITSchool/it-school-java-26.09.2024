package itschool.staticex;

public class Main {

    // instance field
    private int price;

    public static void main(String[] args) {
        System.out.println(Product.myStaticField);

        Main main = new Main();
        main.printPrice();

        // printPrice();
        printPriceOther();

        Product product = new Product();
        Product.printNumberOfInstances();

        Product product1 = new Product();
        Product.printNumberOfInstances();

        // product.myStaticField = "New value";

        System.out.println(product1.myStaticField);

        Product.sayHello();


    }

    // instance method
    public void printPrice() {
        System.out.println(price);
    }

    public static void printPriceOther() {
        System.out.println("Price");
    }
}
