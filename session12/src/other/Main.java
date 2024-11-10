package other;

import model.Dog;

public class Main {

    public static void main(String[] args) {
        // This is not visible because it is protected
        // Dog dog = new Dog("Rex", 3);

        Cat cat = new Cat();
        cat.printDetails();
    }

}
