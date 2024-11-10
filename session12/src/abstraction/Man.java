package abstraction;

public class Man extends Human {

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void printDetails() {
        System.out.println("Print details from Man class");

        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }

    @Override
    public void breath() {
        System.out.println("A man is breathing...");
    }
}
