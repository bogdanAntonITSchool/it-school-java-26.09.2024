package abstraction;

// cannot be instantiated
public abstract class Human extends Animal {

    private String name;
    private int age;

    protected Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void printDetails();

    public void tellMeYourReign() {
        System.out.println("I am a human...");
    }
}