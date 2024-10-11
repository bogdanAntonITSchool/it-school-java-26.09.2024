public class WhileMain {

    public static void main(String[] args) {

        // while loop
        // while (condition) { code }
        // The code inside the while loop will be executed

        /*int i = 0; // starting point
        while (i < 10) { // ending point
            System.out.println("i: " + i); // code to be executed
            i++; // update the condition in order to avoid infinite loop
        }*/

        // array
        // by default, the elements of an array are initialized with 0
        int[] numbers = new int[5]; // array of 5 integer elements

        // the last element index is always the length of the array - 1
        // System.out.println(numbers[100]); // ArrayIndexOutOfBoundsException

        System.out.println(numbers[1]); // will print 0

        int[] numbersWithValues = new int[]{1, 2, 3, 4, 5}; // array of 5 integer elements with values
        System.out.println(numbersWithValues[3]);

        int[] numbersWithValueInline = {1, 2, 3, 4, 5}; // array of 5 integer elements with values

        String[] names = {"Bogdan", "Elena", "Nicu"};
        String name = "Bogdan";

        int i = 0;
        while (i < names.length) {
            System.out.println(names[i]); // names[0], names[1], names[2]
            i++;
        }

        System.out.println("Printing in descending order:");
        int j = names.length - 1;
        while (j >= 0) {
            System.out.println(names[j]);
            j--;
        }

//        int k = 0;
//        do {
//            System.out.println("k: " + k);
//            k++;
//        } while (k != 0); // will lead to an infinite loop

        int k = 0;
        while (k != 0) {
            System.out.println("k: " + k);
            k++;
        }


        for (int l = 0; l < names.length; l++) {
            System.out.println(names[l]);
        }

    }
}
