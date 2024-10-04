public class Main {
    public static void main(String[] args) {
        int x = 3; // 0011
        x >>= 1; // 0001
        x >>= 1; // 0000

        System.out.println(x);

        int y = 20; // 20 / 2 = 10; 10 / 2 = 5; 5 / 2 = 2;
        y >>= 3;

        System.out.println(y);

        int z = 10;
        z += 10;

        System.out.println(z);
        System.out.println(z += 10);

        int a = 10;
        int b = 10;

        System.out.println(a >= b);  // interval inchis
    }
}