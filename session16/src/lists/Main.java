package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // An ArrayList is a resizable array. Compared to a regular array, an ArrayList can grow or shrink in size.

        // This is how we create an ArrayList by specifying the initial capacity.
        // Specifying the initial capacity might be useful when we know the number of elements that we are going to add.
        ArrayList<Integer> arrayList = new ArrayList<>(0);

        // This is how we add elements to the ArrayList.
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // The method 'trimToSize' reduces the capacity of the ArrayList to the number of elements it contains.
        // This is useful when we know that the ArrayList won't grow anymore.
        arrayList.trimToSize();

        // This is how we iterate over the elements of the ArrayList.
        for (Integer value : arrayList) {
            System.out.println(value);
        }

        // This is how we create a List by using the ArrayList implementation.
        // We can't create an instance of List because it is an interface.
        // Before, we have passed the initial capacity to the ArrayList constructor, but this is not mandatory.
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        // by using List, we don't have access to the trimToSize method, which is specific to ArrayList.
        ((ArrayList<Integer>) list).trimToSize();

        for (Integer value : list) {
            System.out.println(value);
        }

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10); // index 0
        linkedList.add(20); // index 1
        linkedList.add(30); // index 2

        // This is how we remove an Integer object from a list of Integers.
        // We remove this way, so we don't confuse the other remove method that takes an index as an argument.
        linkedList.remove(Integer.valueOf(20));

        for (Integer value : linkedList) {
            System.out.println(value);
        }

        // LINKED LIST advantages:
        // - faster insertion and deletion operations

        // ARRAY LIST advantages:
        // - faster access to elements

        // This is how we measure the time taken to add 1,000,000 elements to an ArrayList and a LinkedList.
        long startTimeForArrayList = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }

        long endTimeForArrayList = System.currentTimeMillis();

        System.out.println("Time taken for ArrayList: " + (endTimeForArrayList - startTimeForArrayList) + " ms");

        long startTimeForLinkedList = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }

        long endTimeForLinkedList = System.currentTimeMillis();

        System.out.println("Time taken for LinkedList: " + (endTimeForLinkedList - startTimeForLinkedList) + " ms");

        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Alice");
        names.add("Bob");

        // This is how we remove an element from an ArrayList by specifying the value/object.
        names.remove("Alice");
        // This is how we remove an element from an ArrayList by specifying the index.
        names.remove(1);
    }
}
