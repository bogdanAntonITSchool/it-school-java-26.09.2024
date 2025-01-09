package recap;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        Drivable carDrivable = new Car();
        Drivable bikeDrivable = new Bike();

        car.drive();
        car.otherMethod();

        carDrivable.drive();
        // carDrivable.otherMethod(); // This will not compile
        // ((Car) carDrivable).otherMethod();

        Drivable anonymousCar = new Drivable() {
            @Override
            public void drive() {
                System.out.println("Driving an anonymous car");
            }
        };

        anonymousCar.drive();

        Drivable lambdaCar = () -> System.out.println("Driving a lambda car");

        lambdaCar.drive();

        LambdaInterface lambdaInterface = System.out::println;

        lambdaInterface.someMethod("Hello, World!");


    }
}

@FunctionalInterface
interface LambdaInterface {
    void someMethod(String s);
}

@FunctionalInterface
interface Drivable {
    void drive();

    default void otherMethod() {
        System.out.println("Other method in Drivable");
    }
}

class Car implements Drivable {

    @Override
    public void drive() {
        System.out.println("Driving a car");
    }

    public void otherMethod() {
        System.out.println("Other method in Car");
    }

}

class Bike implements Drivable {

    @Override
    public void drive() {
        System.out.println("Riding a bike");
    }

}