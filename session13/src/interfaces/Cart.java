package interfaces;

public class Cart implements Drivable, Customizable {

    @Override
    public void drive() {
        System.out.println("Driving a cart");
    }

    @Override
    public void customize() {
        System.out.println("Customizing a cart");
    }
}
