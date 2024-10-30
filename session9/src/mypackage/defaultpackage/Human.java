package mypackage.defaultpackage;

import java.util.Arrays;

public class Human {

    // instance variables
    private int age;
    private String name;
    private boolean isAdult;
    private int[] grades;

    // constructor with parameters
    public Human(int age,
                 String name,
                 int[] grades) {
        this.age = age;
        this.name = name;
        this.isAdult = age >= 18;
        this.grades = grades;
    }

    // public Human() {}

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is adult: " + isAdult);
        System.out.println("Grades: " + Arrays.toString(grades));
    }

}
