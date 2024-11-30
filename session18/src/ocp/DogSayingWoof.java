package ocp;

public class DogSayingWoof extends Dog {

    protected DogSayingWoof(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Woof");
    }
}
