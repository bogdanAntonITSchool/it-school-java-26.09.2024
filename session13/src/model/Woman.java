package model;

public class Woman extends Human {

    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    public void printDetails() {
        System.out.println("--------------------");
        System.out.println("Printing woman details : ");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("--------------------");
    }

}
