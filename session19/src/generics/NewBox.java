package generics;

// This is a generic class.
// By having a type parameter, this class can store any type of object.
// This is a better practice as you don't need to cast the object to the desired type when you retrieve it.
public class NewBox<T> {

    private final T content;

    public NewBox(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void printContent() {
        System.out.println(content);
    }

}
