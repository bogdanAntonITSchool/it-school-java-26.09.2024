package interfaces;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(200, 2000, "123456");
        Cart cart = new Cart();

        car.drive();
        car.customize();

        cart.drive();
        cart.customize();

        car.noIdea();

        System.out.println(Customizable.NO_OF_CUSTOMIZATIONS);

        car.newMethod();

        Car.staticMethod();
    }
}


interface A {
    void a();
}

interface B extends A {
    void b();
}

interface C extends A, B {
    void c();
}
