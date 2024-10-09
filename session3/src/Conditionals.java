import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        // Scanner is a class that allows us to read input from the user
        Scanner sc = new Scanner(System.in);

//        int myInt = sc.nextInt();
//        System.out.println("The number is: " + myInt);
//
//        System.out.println(myInt * 1);
//        System.out.println(myInt * 2);
//        System.out.println(myInt * 3);
//        System.out.println(myInt * 4);
//        System.out.println(myInt * 5);
//        System.out.println(myInt * 6);
//        System.out.println(myInt * 7);
//        System.out.println(myInt * 8);
//        System.out.println(myInt * 9);

        // First print the message to the user
        System.out.print("Enter your grade: ");
        // Read the input from the user
        int studentGrade = sc.nextInt();

        // If the student grade is greater than or equal to 5, then print "You passed the exam!"
        // If the student grade is greater than or equal to 1 and less than or equal to 4, then print "You failed the exam!"
        // If the student grade is less than 1 or greater than 10, then print "Invalid grade!"
        if (studentGrade >= 5) {
            System.out.println("You passed the exam!");
            System.out.println("Success!");
        } else if (studentGrade >= 1 && studentGrade <= 4) {
            System.out.println("You failed the exam!");
            System.out.println("Try again!");
        } else {
            System.out.println("Invalid grade!");
        }

        // Ternary operator
        // condition ? true : false
        // If the condition is true, then the value of the ternary operator is the value after the '?'
        // If the condition is false, then the value of the ternary operator is the value after the ':'
        // We can have nested ternary operators, but it's not recommended and it's hard to read
        // Ternary operators return a value, so we can assign the value to a variable
        boolean isPassed = studentGrade >= 5 && studentGrade <= 10
                ? true
                : (studentGrade >= 1 && studentGrade <= 4
                    ? false
                    : false);

        System.out.println("isPassed: " + isPassed);

        boolean isPositive = studentGrade > 0 ? true : false;

        int i1 = 10;
        int i = 10;
    }
}
