public class Precedence {

    public static void main(String[] args) {
        int x = 5;

        System.out.println((x + 1) == ++x);

        // x -> 6
        // 6 == 7 => false

        int y = 5;
        y = (y + ++y) * 2;

        System.out.println(y);
        System.out.println(1 % -5);
    }
}
