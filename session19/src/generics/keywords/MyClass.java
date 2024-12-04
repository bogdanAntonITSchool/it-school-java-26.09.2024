package generics.keywords;

// This is a generic class.
// By having a type parameter that extends SomeInterface, this class can store any type of object that implements SomeInterface.
public class MyClass<T extends SomeInterface> {

    private final T content;

    public MyClass(T content) {
        this.content = content;
    }

    public void doSomethingWithContent() {
        content.printSomething();
    }

}
