package model;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    protected Dog(String name, int age) {
        this(name, age, "Unknown");
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Breed: " + this.breed);
        this.something = 10;
    }

}
