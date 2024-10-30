package mypackage.mysubpackage;

import mypackage.Student;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Student myStudent = new Student();

        myStudent.address = "123 mypackage.Main St.";

        Product product = new Product();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a price: ");
        double price = scanner.nextDouble();

        product.setPrice(price);
        product.printDetails();

        sendEmail("bogdan@gmail.com");
        int sum = sum(1, 2);

        StringBuilder sb = new StringBuilder("Bogdan");
        StringBuilder append = sb.append(" ");
        StringBuilder append1 = append.append("Mihai");
        StringBuilder append2 = append1.append(" ");

        Product p1 = new Product();
        p1.price = 10;

        p1.setPrice(15);
    }

    public static void sendEmail(String email) {
        // sending out an email...
        String message = "Hello, " + email + "!";

        System.out.println();
    }

    public static int sum(int a, int b) {
        System.out.println("Summing " + a + " and " + b);

        return a + b;
    }
}
