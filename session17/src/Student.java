import java.util.Objects;

public class Student {

    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Student student) {
            return Objects.equals(name, student.name)
                    && age == student.age;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return name.length() + age;
    }
}
