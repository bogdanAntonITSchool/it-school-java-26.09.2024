package object;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student("John", 20, "123 object.Main St.");
        Student s2 = s1;

        // == compares the references
        if (s1 == s2) {
            System.out.println("s1 and s2 are the same object");
        } else {
            System.out.println("s1 and s2 are different objects");
        }

        Student s3 = new Student("John", 20, "123 object.Main St.");

        // equals compares the content
        if (s1.equals(s3)) {
            System.out.println("s1 and s3 have the same content");
        } else {
            System.out.println("s1 and s3 have different content");
        }

        Student s4 = new Student("John", 22, "123 object.Main St.");

        if (s1.equals(s4)) {
            System.out.println("s1 and s4 have the same content");
        } else {
            System.out.println("s1 and s4 have different content");
        }

        // hashCode is used to store objects in collections
        // it should be consistent with equals
        // it returns an integer, which represents the object
        int i = s4.hashCode();
        System.out.println(i);

        System.out.println(s4);

        System.out.println(List.of(s1, s2, s3, s4));
    }

}