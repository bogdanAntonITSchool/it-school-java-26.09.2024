package model;

public class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void printDetails() {
        System.out.println("--------------------");
        System.out.println("Printing man details : ");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("--------------------");
    }

}
