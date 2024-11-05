package inheritance;

// This class is a subclass of Human
public class Woman extends Human {

    // Java provides a default constructor if no constructor is defined
    // This default constructor calls the default constructor of the superclass
    // public Woman() {
    //   super("1", 10, "1");
    // }

    private String hobby;

    // This constructor calls the superclass constructor
    // As the superclass does not have a default constructor, the subclass constructor must call the one with parameters
    public Woman(String name, int age, String address) {
        super(name, age, address);
    }

    // By default, the subclass constructor calls the superclass default constructor
    // But if the superclass does not have a default constructor, the subclass constructor must call a superclass constructor
    /*
    public Woman() {
        super();
    }
     */

    // This is an overridden method
    // The method in the superclass is overridden in the subclass
    // This method also calls the superclass method using 'super'
    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Hobby: " + this.hobby);
    }
}
