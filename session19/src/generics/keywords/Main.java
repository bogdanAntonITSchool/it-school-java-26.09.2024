package generics.keywords;

public class Main {

    public static void main(String[] args) {

        // MyClass<String> stringMyClass = new MyClass<>();
        // MyClass<Integer> integerMyClass = new MyClass<>();

        SomeConcreteClass someConcreteClass = new SomeConcreteClass();
        MyClass<SomeConcreteClass> someConcreteClassMyClass = new MyClass<>(someConcreteClass);

        SomeOtherConcreteClass someOtherConcreteClass = new SomeOtherConcreteClass();
        MyClass<SomeOtherConcreteClass> someOtherConcreteClassMyClass = new MyClass<>(someOtherConcreteClass);

        someConcreteClassMyClass.doSomethingWithContent();
        someOtherConcreteClassMyClass.doSomethingWithContent();

    }
}
