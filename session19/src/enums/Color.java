package enums;

// Enum declaration
public enum Color {

    // Initialization of the enum constants
    RED("red"),
    GREEN("green"),
    BLUE("blue");
    // end of initialization of the enum constants

    // Class-like structure
    private final String lowerCase;

    Color(String lowerCase) {
        this.lowerCase = lowerCase;
    }

    public String getLowerCase() {
        return lowerCase;
    }

    // other instance methods...

    // end of class-like structure

    // Static method to get the enum constant by its value
    public static Color getEnumByValue(String value) {
        for (Color color : values()) {
            if (color.lowerCase.equalsIgnoreCase(value)) {
                return color;
            }
        }
        return null;
    }

    public static void hello() {
        System.out.println("Hello from Color enum");
    }
    // end of static method to get the enum constant by its value
}
