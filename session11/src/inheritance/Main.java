package inheritance;

public class Main {
    public static void main(String[] args) {

        Human human = new Human("John", 25, "New York");
        Woman woman = new Woman("Jane", 30, "Los Angeles");

        String humanAddress = human.getAddress();
        String womanAddress = woman.getAddress();

        System.out.println(humanAddress);
        System.out.println(womanAddress);

        System.out.println("-----------------");
        human.printDetails();
        System.out.println("-----------------");
        woman.printDetails();
    }
}
