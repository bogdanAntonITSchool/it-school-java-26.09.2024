package object;

public class Student {

    private final String name;
    private final int age;
    private final String address;

    public Student(String name, int age, String address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // this is an example of equals implementation
    @Override
    public boolean equals(Object obj) {
        // we check if we compare the current object with itself
        if (this == obj) {
            return true;
        }

        // we check if the comparing object is the same type
        // then we cast it to the same type
        // then we compare the fields
        // it's up to us to decide which fields to compare
        return (obj instanceof Student student)
                && name.equals(student.name)
                && age == student.age
                && address.equals(student.address);
    }

    // this is an example of hashCode implementation
    @Override
    public int hashCode() {
        return name.hashCode() + age + address.hashCode();
    }

    // this is an example of toString implementation
    @Override
    public String toString() {
        return "object.Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
