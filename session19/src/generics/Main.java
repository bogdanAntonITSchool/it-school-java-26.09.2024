package generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Box stringBox = new Box("Hello, world!");
        Box intBox = new Box(42);
        Box studentBox = new Box(new Student("John Doe", new double[]{6.5, 8.0, 7.7}));

        Object content = stringBox.getContent();
        Object content1 = intBox.getContent();
        Object content2 = studentBox.getContent();

        if (content2 instanceof Student student) {
            student.printReport();
        }

        NewBox<Student> studentNewBox = new NewBox<>(new Student("Jane Doe", new double[]{8.5, 9.0, 7.7}));

        Student student = studentNewBox.getContent();
        student.printReport();

        String s = printBoxContent("Hello, world!");
        Integer i = printBoxContent(10);

        List<String> l = new ArrayList<>();

        // 1000 lines of code

        l.add("Hello, world!");
        // l.add(10);
        // l.add(new Student("John Doe", new double[]{6.5, 8.0, 7.7}));

        String o = l.get(1);
    }

    public static <E> E printBoxContent(E parameter) {
        System.out.println(parameter);
        return parameter;
    }

}