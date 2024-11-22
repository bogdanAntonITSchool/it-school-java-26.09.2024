package sets;

// This class implements the 'Comparable' interface. This accepts a generic type, which is the type of the objects that we want to compare.
// This interface is used to define the natural ordering of the objects of a class
public class Student implements Comparable<Student> {

    private final String name;
    private final Double grade;

    public Student(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }


    // Object is the superclass of all classes in Java
    // equals is a method that is used to compare two objects
    // Before casting an object, we should check if it is an instance of the class we want to cast it to.
    // The equals method must be overridden whenever we want to compare the values of the fields of two objects.
    @Override
    public boolean equals(Object object) {
        if (object instanceof Student student) {
            return student.name.equals(this.name)
                    && student.grade.equals(this.grade);
        }
        return false;
    }

    // hashCode is a method that returns an integer value that represents the object
    // This value is used by hash-based collections like HashSet, HashMap, or HashTable
    // The hashCode method must be overridden whenever the equals method is overridden
    // The hashCode method must return the same value for two objects that are equal
    // The hashCode method must return different values for two objects that are not equal
    @Override
    public int hashCode() {
        return name.length() + grade.intValue();
    }

    // natural ordering
    //
    // The compareTo method is used to compare two objects
    // negative if this is less than o
    // zero if this is equal to o
    // positive if this is greater than o
    @Override
    public int compareTo(Student o) {
        return this.grade.compareTo(o.grade);
        // if you need the reverse order, you can use the following line:
        // return o.grade.compareTo(this.grade);
    }
}
