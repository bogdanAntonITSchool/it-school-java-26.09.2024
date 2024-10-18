import java.util.Scanner;

public class ExerciseSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int i;
//        int sum = 0;
//
//        while (true) {
//            System.out.println("Enter the number: ");
//            i = scanner.nextInt();
//            if (i <= 0) {
//                break;
//            }
//            sum += i;
//        }
//
//        for (;;) {
//            System.out.println("Enter the number: ");
//            i = scanner.nextInt();
//            if (i <= 0) {
//                break;
//            }
//            sum += i;
//        }
//
//        do {
//            System.out.println("Enter the number: ");
//            i = scanner.nextInt();
//            if (i <= 0) {
//                break;
//            }
//            sum += i;
//        } while (true);
//
//        System.out.println("The sum of all positive numbers entered is: " + sum);




        System.out.println("Enter the number: ");

        int sum = 0;
        int i = scanner.nextInt();

        while (i > 0) {
            sum += i;
            System.out.println("Enter the number: ");
            i = scanner.nextInt();
        }

        System.out.println("The sum of all positive numbers entered is: " + sum);

    }
}
