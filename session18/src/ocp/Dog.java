package ocp;

public class Dog extends Animal {

    private final String breed;

    protected Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }

}
