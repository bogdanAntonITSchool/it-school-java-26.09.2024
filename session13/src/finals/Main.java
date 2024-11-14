package finals;

public class Main {

    public static void main(String[] args) {

//        FinalClass finalClass = new FinalClass(10);
//        System.out.println(finalClass.getX());
//
//        OtherChildClass childClass = new OtherChildClass();
//        childClass.print();

//        ChildClass c = new ChildClass(10);
//        System.out.println(c.getX());

        ChildClass c = new ChildClass();
        System.out.println(c.getX());

        print("Salut");
    }

    public static void print(final String value) {
        System.out.println(value);
        final int x = 10;
    }

}


interface A {
    void print(final String value);
}

class B implements A {

    @Override
    public void print(String value) {

    }
}