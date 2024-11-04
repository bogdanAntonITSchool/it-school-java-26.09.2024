package itschool;

import itschool.model.Car;
import itschool.model.Customer;

public class Main {
    public static void main(String[] args) {
        Car defaultCar = new Car();

        // System.out.println(defaultCar.isUsed);
        // defaultCar.year = 10;

        // overloading calls
        int sum = sum(1, 2);
        int sum1 = sum(1, 2, 3);
        int sum2 = sum(1, 2, 3, 4);

        Car toyota = new Car("Toyota", "Corolla");
        Car allParamsCar = new Car(2020, "Toyota", "Corolla",
                "Black", 10000, false);


        Car myCar = new Car(2024, "Volkswagen", "Golf",
                "Red", 20000, false);

        myCar.drive();
        toyota.drive();

        System.out.println("------------------");

        int balance = 10000;
        myCar.buyCar(balance);

        Customer customer = new Customer("New York", "john@doe.com");
        customer.printCustomerInfo();

        int price = myCar.getPrice();
        price = 10;

        myCar.printCarInfo();
    }

    // overloading
    // it means that we can have multiple methods with the same name
    // but different parameters (number of parameters, type of parameters)

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}