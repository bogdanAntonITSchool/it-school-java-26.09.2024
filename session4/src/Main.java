import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Read an integer input from the user, representing a person's age,
        // and use conditionals to check if the user is an adult (18 or older).
        Scanner scanner = new Scanner(System.in);

        // CTRL + SHIFT + / to comment/uncomment a block of code
        /*System.out.print("Enter your age: ");
        int userAge = scanner.nextInt();

        if (userAge >= 18) {
            System.out.println("You are an adult.");
        } else if (userAge >= 0) {
            System.out.println("You are not an adult.");
        } else {
            System.out.println("Invalid age.");
        }*/

        // Determine whether an input integer is odd or even using the modulus operator and a ternary.
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//
//        boolean isEven = number % 2 == 0 ? true : false;
//        if (isEven) {
//            System.out.println("The number is even.");
//        } else {
//            System.out.println("The number is odd.");
//        }

        // Take an integer score as input and determine if the student passes or fails.
//        System.out.print("Enter your score: ");
//        int score = scanner.nextInt();
//
//        if (score >= 5 && score <= 10) {
//            System.out.println("You passed the exam!");
//        } else if (score >= 1 && score <= 4) {
//            System.out.println("You failed the exam!");
//        } else {
//            System.out.println("Invalid score!");
//        }
/*
        // Read three side lengths as integers and determine if they form a valid triangle.
        // If so, specify if it is equilateral, isosceles, or scalene.
        System.out.print("Enter the first side length: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second side length: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third side length: ");
        int c = scanner.nextInt();

        // A triangle is valid if the sum of any two sides is greater than the third side.
        if ((a + b > c)
                && (a + c > b)
                && (b + c > a)) {
            System.out.println("The triangle is valid.");

            if (a == b && b == c) { // ==> implies a == c
                System.out.println("The triangle is equilateral.");
            } else if (a == b || a == c || b == c) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene");
            }
        } else {
            System.out.println("The triangle is invalid.");
        }*/

        // Determine if a given year is a leap year.
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // A leap year is divisible by 4, but not by 100, unless it is divisible by 400.
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}