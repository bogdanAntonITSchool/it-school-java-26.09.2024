public class Main {
    public static void main(String[] args) {
        byte b = 127;
        char c = 'a';

        int a = b + c;
        System.out.println(a); // won't print 127a, but will print 127 + 97 = 224

        int var1 = 10;
        int var2 = 3;

        int var3 = var1 % var2; // modulo
        System.out.println(var3); // prints 1

        // var3 = 1 + 1; => var3 is now 2
        var3 = var3 + 1; // holds 2
        System.out.println(var3); // prints 2

        // var3 = 2 + 1; => var3 is now 3
        var3++; // equivalent to "var3 = var3 + 1;"
        System.out.println(var3);

        // var3 = 3 + 1; => var3 is now 4
        var3++;
        System.out.println(var3);
    }
}