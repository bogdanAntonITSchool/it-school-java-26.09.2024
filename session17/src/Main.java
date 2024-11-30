import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Student john = new Student("John", 20);
        Student fakeJohn = john;
        Student johnny = new Student("John", 20);

        Set<Student> students = new HashSet<>();

        students.add(john);
        students.add(fakeJohn);

        students.add(johnny);

        System.out.println(students);

        // This is a custom comparator that compares students by age
        StudentComparator studentComparator = new StudentComparator();
        Set<Student> treeStudents = new TreeSet<>(studentComparator);

        Student s1 = new Student("John", 20);
        Student s2 = new Student("Alice", 22);
        Student s3 = new Student("Bob", 21);

        treeStudents.add(s1);
        treeStudents.add(s2);
        treeStudents.add(s3);

        System.out.println(treeStudents);

    }


    public int sum(int a, int b) {
        return a + b;
    }
}