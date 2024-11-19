package recap.model;

public class CompanyClient extends Client {

    private final String cui;

    public CompanyClient(String name,
                            String address,
                            String email,
                            String cui) {
        super(name, address, email);
        this.cui = cui;
    }

    public String getCui() {
        return cui;
    }

    @Override
    public String getClientType() {
        return "Company";
    }

    @Override
    public void printClientDetails() {
        System.out.println("--------------------");
        System.out.println("Company client details:");
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Email: " + getEmail());
        System.out.println("CUI: " + cui);
    }
}
