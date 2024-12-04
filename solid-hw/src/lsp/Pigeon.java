package lsp;

public class Pigeon extends FlyingBird {

    protected Pigeon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping");
    }

    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

}
