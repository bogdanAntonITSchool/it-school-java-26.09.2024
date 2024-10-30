package mypackage;

// We can have at most one public class per file
// This is a class definition
public class Student {

    // These are instance variables
    // default access modifier is package-private, meaning that only classes in the same package can access them
    int age;
    // Here we have a field with a default value
    String name = "John";
    // public access modifier means that any class can access this field
    public String address;
    double[] grades;

    // for numeric primitives the default value is 0
    // for boolean the default value is false
    // for reference types the default value is null

    // This is an instance method
    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    // This is an instance method
    double calculateAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}

// mypackage.Student has 3 fields: age, name, and address
// mypackage.Student can print its information
