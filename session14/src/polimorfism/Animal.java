package polimorfism;

public class Animal {

    public void makeSomeNoise() {
        System.out.println("Animal is making some noise...");
    }

    // Overloading
    public void makeSomeNoise(String animalName) {
        System.out.println(animalName + " is making some noise...");
    }
}
