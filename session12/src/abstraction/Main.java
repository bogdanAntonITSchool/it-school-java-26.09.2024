package abstraction;

public class Main {

    public static void main(String[] args) {
//        Human human = new Human();
//        human.printDetails();

        Woman woman = new Woman("Alice", 25);
        woman.printDetails();

        Man man = new Man("Bob", 30);
        man.printDetails();

        woman.tellMeYourReign();
        man.tellMeYourReign();
    }
}
