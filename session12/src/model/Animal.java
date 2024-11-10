package model;

// private -> default -> protected -> public
public class Animal {

    // instance variables
    private String name; // null by default
    private int age; // 0 by default

    // default access modifier is package-private
    int something;

    // protected access modifier restricts access to this field to this class and its subclasses
    protected int anotherThing;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected Animal() {
        this("Unknown", 0);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    // Method signature consists of method name and parameter list
    public void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}


