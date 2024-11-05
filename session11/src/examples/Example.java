package examples;

public class Example {

    private String firstName; // default value is null
    private String lastName; // default value is null

    private String fullName; // default value is null

    // private constructor
    // this can be used to prevent various issues
    // here we are using it to prevent NullPointerException
    private Example() {
        this.fullName = "";
    }

    public Example(String firstName, String lastName) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;

        // NullPointerException
        this.fullName = this.fullName.concat(firstName)
                .concat(" ")
                .concat(lastName);
    }
}
