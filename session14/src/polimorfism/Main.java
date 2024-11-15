package polimorfism;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeSomeNoise();

        Dog dog = new Dog();
        dog.makeSomeNoise();

        animal.makeSomeNoise("Cat");
        dog.makeSomeNoise("Dog");
    }
}
