package interfaces;

public interface Customizable {

    // 'public static final' is implicit
    int NO_OF_CUSTOMIZATIONS = 10;
    String DEFAULT_COLOR = "black";

    // 'public' is implicit
    void customize();

    default void noIdea() {
        System.out.println("No idea what to do...");

        privateMethod();
    }

    default void newMethod() {
        privateMethod();
    }

    private void privateMethod() {
        // duplicate code...
        System.out.println("salut");
        System.out.println("salut");
        System.out.println("salut");
        System.out.println("salut");
        System.out.println("salut");
        System.out.println("salut");
        System.out.println("salut");
        // end of duplicate code
    }

}
