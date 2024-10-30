package mypackage;

// We can have multiple classes with the same name in different packages
public class Main {
    public static void main(String[] args) {
        // This is how to instantiate an object of the Student class
        Student myStudent = new Student();

        // This is how to call a method on an object
        myStudent.printInfo();

        // This is how to access a field on an object and assign a value to it
        myStudent.name = "Danny";
        myStudent.age = 25;
        myStudent.address = "123 mypackage.Main St.";

        System.out.println("-----------------");
        myStudent.printInfo();

        // We can create another object of the same class
        Student anotherStudent = new Student();

        // The instance variables are not shared between objects of the same class
        anotherStudent.name = "Alice";
        anotherStudent.age = 22;
        anotherStudent.address = "456 Elm St.";

        System.out.println("-----------------");
        anotherStudent.printInfo();

        anotherStudent.name = "Bob";

        System.out.println("-----------------");
        anotherStudent.printInfo();

        System.out.println("-----------------");
        Student student = new Student();
        student.grades = new double[]{10, 9, 8, 7, 6};
        System.out.println(student.calculateAverage());
    }

}