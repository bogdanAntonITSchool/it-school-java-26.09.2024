package interfaces;

public class Car extends Vehicle implements Customizable {

    private String serialNumber;

    protected Car(int hp, int engineSize, String serialNumber) {
        super(hp, engineSize);
        this.serialNumber = serialNumber;
    }

    @Override
    public void drive() {
        System.out.println("Driving a car with the following details: ");
        System.out.println("HP: " + getHp());
        System.out.println("Engine size: " + getEngineSize());
        System.out.println("Serial number: " + serialNumber);
    }

    @Override
    public void customize() {
        System.out.println("Customizing a car...");
    }

//    @Override
//    public void noIdea() {
//        // missing implementation
//    }


    @Override
    public void newMethod() {
        Customizable.super.newMethod();
        System.out.println("new method in Car");
    }

    public static void staticMethod() {
        System.out.println("Static method in Car");
    }
}
