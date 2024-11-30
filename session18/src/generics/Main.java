package generics;


import java.util.Optional;

public class Main {

    public static void main(String[] args) {
//        MyClass<String> myClass = new MyClass<>("Hello, world!");
//
//        System.out.println(myClass.getField());
//
//        MyClass<Integer> myClass2 = new MyClass<>(42);
//
//        System.out.println(myClass2.getField());

        String nullValue = "salut";
        String value = "Hello, world!";

        Optional<String> optional = Optional.of(nullValue);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        } else {
            System.out.println("No value");
        }

        MyClass<String> myClass = new MyClass<>("stringvalue", 10);

        String field = myClass.getField();
        Object field2 = myClass.getField2();


        String result = myClass.getSomething("salutare");
        System.out.println(result);

    }

}
