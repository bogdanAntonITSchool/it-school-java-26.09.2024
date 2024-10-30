package mypackage.multiconstructors;

// We can have multiple classes with the same name in different packages
public class Main {

    public static void main(String[] args) {

        // This is how to instantiate an object of the Human class using different constructors
        Human humanWithNoArgs = new Human();
        Human humanWithAge = new Human(25);
        Human humanWithAgeAndName = new Human(25, "Danny");
        Human humanWithAgeNameAndAddress = new Human(25, "Danny", "123 mypackage.Main St.");

        // This is how to call a method on an object
        humanWithNoArgs.printDetails();
        humanWithAge.printDetails();
        humanWithAgeAndName.printDetails();
        humanWithAgeNameAndAddress.printDetails();

        // This is how to call overloaded methods
        sayHello();
        sayHello("Bogdan");
        sayHello("Bogdan", 25);
    }

    // An overloaded method is a method with the same name but different parameters
    // Overloaded methods
    private static void sayHello() {
        System.out.println("Hello");
    }

    // Overloaded methods
    private static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // Overloaded methods
    private static void sayHello(String name, int age) {
        System.out.println("Hello " + name + " you are " + age + " years old");
    }
}
