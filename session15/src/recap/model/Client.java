package recap.model;

public abstract class Client {

    private final String name;
    private final String address;
    private final String email;

    protected Client(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getClientType();

    public abstract void printClientDetails();

}
