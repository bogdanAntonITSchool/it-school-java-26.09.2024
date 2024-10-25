import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr.length; i++) {
//            int value = arr[i];
//            System.out.println(value);
//        }
//
//        System.out.println("------");
//        for (int value : arr) {
//            // value -- arr[i]
//            System.out.println(value);
//        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();
        int reverse = 0;

        // impartiri succesive cu 10 pana cand numarul devine 0
        while (number != 0) {
            int rest = number % 10;
            reverse = reverse * 10 + rest;
            number = number / 10;
        }
        System.out.print(" reverse is = " + reverse);
    }
}