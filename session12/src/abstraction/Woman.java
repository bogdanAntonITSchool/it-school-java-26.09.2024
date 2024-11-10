package abstraction;

public class Woman extends Human {

    public Woman(String name, int age) {
        super(name, age);
    }

    @Override
    public void printDetails() {
        System.out.println("Print details from Woman class");

        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }

    @Override
    public void breath() {
        System.out.println("A woman is breathing...");
    }
}
