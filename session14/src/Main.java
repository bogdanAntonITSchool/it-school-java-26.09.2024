public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        MyClass myClass = new MyClass();
        myClass.doSomething();

        Dog.bark();

        Dog myLittleDog = new Dog(10, "Bolt");
        myLittleDog.eat();

        // dog.bark(); -> not recommended
    }
}