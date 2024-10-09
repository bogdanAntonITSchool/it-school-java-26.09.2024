public class Main {
    public static void main(String[] args) {
        byte b = 10;
        int i = 50;

        // final means constant
        final int intResult = b + i;

        // ways to declare a float
        // we need to add 'f' at the end of the number because by default, Java considers decimal numbers as double
        float f = .5f;
        float f2 = 0.1f;

        double d = 0.1d;

        // ways to declare a long
        // we need to add 'l' at the end of the number because by default, Java considers integer numbers as int
        long l1 = 100l;
        long l = 100_000_000_000L;

        // numeric promotion
        // byte -> short -> int -> long -> float -> double
        long longResult = l + b;

        // long + float = float
        float v = l + f;

        int x; // declaration
        int y = 10; // initialization
        System.out.println("Hello, world!"); // expression
    }
}