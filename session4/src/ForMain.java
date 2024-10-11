public class ForMain {

    public static void main(String[] args) {
        // for loop
        // for (initialization; condition; update) { code }
        // The code inside the for loop will be executed

        String[] names = {"Bogdan", "Elena", "Nicu"};

        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name);
        }

        for (int i = 0; i < names.length; i++) {

        }

        if (true) {
            int x = 10; // x is only available in this block
        }

        // similar to while loop
//        int i = 0;
//        for (; i < names.length; ) {
//            System.out.println(names[i]);
//            i++;
//        }

        // enhanced for loop
        for (String name : names) {
            System.out.println(name);
        }

        int[] values = {1, 2, 3, 4, 5};
        for (int value : values) {
            System.out.println(value);
        }
    }
}
