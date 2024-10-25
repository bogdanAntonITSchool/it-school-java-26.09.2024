import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // this is how you call a method
        String str = bogdanMethod();
        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int i = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int j = scanner.nextInt();

        // this is how you call a method with parameters
        int sum = doSum(i, j);
        System.out.println(sum);
        System.out.println(sum);

        // this is how you pass the result of a method as a parameter to another method
        System.out.println(doSum(doSum(10, 11), doSum(12, 13)));

        int[] numbers = {1, 2, 3, 4, 5};
        // this is how you call a method with an array as a parameter
        int sumInArray = doSumInArray(numbers);
        System.out.println(sumInArray);

        // this is how you call a method with varargs without passing any arguments
        int sumForEmptyArray = doSumInArrayVarargs();
        System.out.println(sumForEmptyArray);

        int[] numbers2 = {1, 2, 3, 4, 5};
        // this is how you call a method with varargs
        int sum2 = doSumInArrayRecursive(numbers2, 0, 0);

        System.out.println(sum2);
    }

    // this is a simple method that computes the sum of all elements in an array using recursion
    public static int doSumInArrayRecursive(int[] numbers, int sum, int index) {
        if (index == numbers.length) {
            return sum;
        }
        return doSumInArrayRecursive(numbers, sum + numbers[index], index + 1);
    }

    // this is a simple method that returns a String
    public static String bogdanMethod() {
        return "Hello";
    }

    // this is a simple method that returns an int
    public static int doSum(int a, int b) {
        return a + b;
    }

    // this is a simple method that computes the sum of all elements in an array
    public static int doSumInArray(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // this is a simple method that computes the sum of all elements in an array using varargs
    public static int doSumInArrayVarargs(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // this is a method that returns void and has a variable number of arguments
    public static void doSomething(int x, boolean y, char z, boolean... booleans) {

    }
}