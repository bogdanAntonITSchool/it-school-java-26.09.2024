package other;

import model.Animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
        this.anotherThing = 10;
    }

    public Cat() {
        super();
    }
}
