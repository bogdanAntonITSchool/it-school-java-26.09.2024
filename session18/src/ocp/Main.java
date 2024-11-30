package ocp;

/**
 * For the Open-Closed Principle, we must design our classes in a way that they are open for extension but closed for modification.
 */
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog("Buddy", 5, "Golden Retriever");

        dog.makeSound(); // will print "Bark"!

        Animal dogSayingWoof = new DogSayingWoof("Buddy", 5, "Golden Retriever");

        dogSayingWoof.makeSound(); // will print "Bark" and "Woof"!
    }
}
