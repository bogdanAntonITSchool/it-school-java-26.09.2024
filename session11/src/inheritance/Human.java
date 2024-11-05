package inheritance;

// this is the superclass
public class Human {

    // instance fields
    // private access modifier restricts access to these fields to this class only
    // so, these fields cannot be accessed from other classes (including subclasses)
    private String name;
    private int age;
    private String address;

//    public Human () {}

    // having this constructor will prevent the default constructor from being created
    // and the subclasses must implement a constructor that calls this constructor
    public Human(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // This method is overridden by the subclass 'Woman'
    public void printDetails() {
        System.out.println("Address: " + this.getAddress());
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
    }
}
