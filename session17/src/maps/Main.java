package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();

        myMap.put(3, "John");
        myMap.put(2, "Alice");
        myMap.put(1, "Bob");

        System.out.println(myMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3, "John");
        linkedHashMap.put(2, "Alice");
        linkedHashMap.put(1, "Bob");

        System.out.println(linkedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(3, "John");
        treeMap.put(2, "Alice");
        treeMap.put(4, "Bob");

        System.out.println(treeMap);

        String s = treeMap.get(2);
        if (treeMap.containsValue("George")) {
            System.out.println("George is in the map");
        } else {
            System.out.println("George is not in the map");
        }

        List<String> strings = new ArrayList<>();

        for (String string : strings) {

        }

        System.out.println("-----------------");

        Map<Integer, String> myHumans = new HashMap<>();

        myHumans.put(1, "John");
        myHumans.put(2, "Alice");
        myHumans.put(3, "Bob");
        myHumans.put(4, "George");

        Set<Integer> keys = myHumans.keySet();
        for (Integer key : keys) {
            System.out.println(key + " -> " + myHumans.get(key));
        }

        System.out.println("-----------------");

        Set<Map.Entry<Integer, String>> entries = myHumans.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        myHumans.replace(1, "johnny");

    }

    //              Iterable
    //                 |
    //              Collection
    //               /     \
    //            List     Set


    // [
    //     [1, "Bob"],
    //     [2, "Alice"],
    //     [3, "John"]
    // ]
}
