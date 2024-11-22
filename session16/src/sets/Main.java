package sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Student myStudent = new Student("John", 9.5);
        Student mySecondStudent = new Student("Alice", 9.5);

        // An example of how to compare two objects using the equals method
        if (myStudent.equals(mySecondStudent)) {
            System.out.println("The objects are equal");
        }

        Set<Integer> mySet = new HashSet<>();
        // This is how to create an immutable set
        Set<Integer> immuteabelSet = Set.of(1, 2, 3, 4, 5);

        // immuteabelSet.add(6); // this will throw an UnsupportedOperationException

        // This is how to create an immutable list
        List<Integer> list = List.of(1, 1, 2, 2, 3, 4, 5);

        Set<Integer> integers = new HashSet<>(list);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        Set<Student> students = new HashSet<>();

        // This is how to add elements to a set
        students.add(new Student("John", 9.5));
        // We try to add two identical objects in terms of the values of the fields
        // Sets must keep only unique elements
        // In Java, by default, the equals method compares the memory addresses of the objects
        // We must create our own implementation of 'equals' and 'hashCode' methods.
        students.add(new Student("John", 9.5));

        for (Student student : students) {
            System.out.println(student);
        }

        // The 'TreeSet' class is a set that uses a tree for storage.
        // This means that the elements are ordered according to their natural ordering.
        // By default, in Java natural order exists for numbers and strings. (ascending order)
        // If we want to store other Objects than numbers or strings, we must implement the 'Comparable' interface
        // Another alternative is to pass a 'Comparator' object to the TreeSet constructor.
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(2);

        for (Integer integer : treeSet) {
            System.out.println(integer);
        }

        Set<Student> treeSetStudent = new TreeSet<>();

        treeSetStudent.add(new Student("John", 9.5));
        treeSetStudent.add(new Student("Alice", 10.));
        treeSetStudent.add(new Student("Bob", 6.5));

        for (Student student : treeSetStudent) {
            System.out.println(student);
        }

    }
}
