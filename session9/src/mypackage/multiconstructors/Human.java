package mypackage.multiconstructors;

public class Human {

    // instance variables with private access modifier
    private int age;
    private String name;
    private String address;

    // constructor with no parameters but calls another constructor with default values
    public Human() {
        this(0, "John", "Unknown");
    }

    // constructor with one parameter but calls another constructor with default values
    public Human(int age) {
        this(age, "John", "Unknown");
    }

    // constructor with two parameters but calls another constructor with default values
    public Human(int age, String name) {
        this(age, name, "Unknown");
    }

    // constructor with three parameters
    public Human(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    // instance method
    public void printDetails() {
        System.out.println("--------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
