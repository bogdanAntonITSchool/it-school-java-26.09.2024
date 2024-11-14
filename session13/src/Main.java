import model.Man;
import model.Woman;
import shapes.Circle;
import shapes.Rectangle;

public class Main {
    public static void main(String[] args) {

        Woman woman = new Woman("Alice", 25);
        woman.printDetails();

        Man man = new Man("Bob", 30);
        man.printDetails();

        D d = new D();
        d.print();

        Rectangle rectangle = new Rectangle("green", 10, 20);
        Circle circle = new Circle("red", 5);

        System.out.println(rectangle.getDetails());
        System.out.println(circle.getDetails());

        System.out.println(rectangle.area());
        System.out.println(circle.area());

    }
}

abstract class A {
    abstract void print();
}

class B extends A {
    void print() {
        System.out.println("B");
    }
}

class C extends A {
    void print() {
        System.out.println("C");
    }
}

class D extends B {
}

// Diamond problem
// class D extends B, C {
// }

//          A
//         / \
//        B   C
//         \ /
//          D


abstract class X {
    abstract void method();
}

abstract class Y extends X {
}

abstract class Z extends Y {
}

class W extends Z {

    @Override
    void method() {

    }
}

abstract class V extends W {

}

// This class does not have to implement method() because it is already implemented in W
class U extends V {

}

//      X (abstract) -> method()
//      |
//      Y (abstract) -> method() is inherited from X
//      |
//      Z (abstract) -> method() is inherited from Y
//      |
//      W (concrete) -> method() is inherited from Z

