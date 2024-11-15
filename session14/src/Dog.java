public class Dog {

    // constants
    private static final String ANONYMOUS_STRING = "Anonymous dog is barking...";

    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void eat() {
        System.out.println("Dog called " + name + " and age " + age + " is eating...");
    }

    public static void bark() {
        System.out.println(ANONYMOUS_STRING);
    }

    public void otherMethod() {
        System.out.println("Other method...");
        System.out.println(ANONYMOUS_STRING);
    }
}
