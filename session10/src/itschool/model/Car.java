package itschool.model;

public class Car {

    // instance variables
    private int year;
    private String brand;
    private String model;
    private String color;
    private int price;
    private boolean isUsed;
    private boolean isStandard = true;

    public Car() {}

    public Car(int year,
               String brand,
               String model,
               String color,
               int price,
               boolean isUsed) {

        this.year = year;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.isUsed = isUsed;

        this.isStandard = false;

    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;

        // default values
        this.year = 2024;
        this.color = "Black";
        this.price = 10000;
        this.isUsed = false;
    }

    public void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
            return;
        }
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    // instance methods
    public void drive() {
        System.out.println("Driving the car called "
                + brand + " " + model
                + " having color " + color);
    }

    public void buyCar(int balance) {
        if (balance < price) {
            System.out.println("You don't have enough money to buy this car");
            return;
        }

        System.out.println("Buying the car called "
                + brand + " " + model
                + " having color " + color);
    }

    public void printCarInfo() {
        System.out.println("Car year: " + year);
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
        System.out.println("Car price: " + price);
        System.out.println("Car is used: " + isUsed);
        System.out.println("Car is standard: " + isStandard);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public boolean isStandard() {
        return isStandard;
    }

    public void setStandard(boolean standard) {
        isStandard = standard;
    }
}