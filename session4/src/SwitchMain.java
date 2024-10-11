import java.util.Scanner;

public class SwitchMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekDay = scanner.nextInt();

//        if (weekDay == 5) {
//            System.out.println("It's Friday!");
//        } else if (weekDay == 6) {
//            System.out.println("It's Saturday!");
//        } else if (weekDay == 7) {
//            System.out.println("It's Sunday!");
//        } else {
//            System.out.println("It's a weekday!");
//        }

        // switch statement prior to Java 12
        switch (weekDay) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("It's a weekday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            case 6:
                System.out.println("It's Saturday!");
                break;
            case 7:
                System.out.println("It's Sunday!");
                break;
            default:
                System.out.println("Invalid day!");
        }

        // enhanced switch
        switch (weekDay) {
            case 1, 2, 3, 4 -> {
                if (weekDay < 3) {
                    System.out.println("It's beginning of the week!");
                } else {
                    System.out.println("It's the middle of the week!");
                }
                System.out.println("It's a weekday!");
            }
            case 5 -> System.out.println("It's Friday!");
            case 6 -> System.out.println("It's Saturday!");
            case 7 -> System.out.println("It's Sunday!");
            default -> System.out.printf("Invalid day!");
        }

        String weekDayText = switch (weekDay) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown";
        };

        System.out.println("Today is " + weekDayText); // Today is Monday
    }
}
