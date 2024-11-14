package finals;

// public class ChildClass extends FinalClass {
    // Error: Cannot inherit from final 'finals.FinalClass'
// }

import java.util.Scanner;

public class ChildClass {

    private final int x;

    static {
        System.out.println("static block...");
    }

    public ChildClass() {
        System.out.println("called constructor");
    }

    {
        System.out.println("instance block...");

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
    }

    public final void print() {
        System.out.println("Printing from ChildClass");
    }

    public void printWithoutFinal() {
        System.out.println("Printing from ChildClass without final");
    }

    public int getX() {
        return x;
    }
}
