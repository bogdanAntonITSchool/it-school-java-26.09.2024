package itschool.staticex;

public class Product {

    // final means that the value of the field cannot be changed
    public static final String myStaticField = "Static field!!!";

    private static int instances = 0;

    private int price;

    public Product() {
        instances++;
    }

    public static void sayHello() {
        System.out.println("Hello from static method");
    }

    public void sayHelloInstance() {
        System.out.println("Hello from instance method");
        sayHello();
        System.out.println(myStaticField);
    }

    public static void printNumberOfInstances() {
        System.out.println("Number of instances: " + instances);
    }
}
