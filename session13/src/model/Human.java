package model;

// We cannot create an instance of this class, as it is abstract.
public abstract class Human {

    private String name;
    private int age;

    protected Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void printDetails();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
