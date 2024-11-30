package generics;

/**
 * This class is used to demonstrate the use of generics.
 * The class has a generic type T. This type can be used in the class fields, methods, and constructors.
 *
 * @param <T>
 */
public class MyClass<T> {

    private final T field;

    private Object field2;

    public MyClass(T field, Object field2) {
        this.field = field;
        this.field2 = field2;
    }

    // This method has a generic type E. This type can be used in the method parameters and return type.
    public <E> T getSomething(E... value) {
        System.out.println(value);
        return field;
    }

    public T getField() {
        return field;
    }

    public Object getField2() {
        return field2;
    }

}
