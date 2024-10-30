package mypackage.defaultpackage;

// We can have multiple classes with the same name in different packages
public class Main {

    public static void main(String[] args) {
        Human human = new Human(25,
                "Danny",
                new int[]{10, 9, 8, 7, 6});
        human.printInfo();

        int x;
        x = 10;
    }
}
