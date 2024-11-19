package recap.model;

public class IndividualClient extends Client {

    private final String cnp;

    public IndividualClient(String name,
                               String address,
                               String email,
                               String cnp) {
        super(name, address, email);
        this.cnp = cnp;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public String getClientType() {
        return "Individual";
    }

    @Override
    public void printClientDetails() {
        System.out.println("--------------------");
        System.out.println("Individual client details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
        System.out.println("CNP: " + cnp);
    }
}
