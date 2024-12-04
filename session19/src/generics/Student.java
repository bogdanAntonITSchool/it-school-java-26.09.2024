package generics;

public class Student {

    private final String name;
    private final double[] grades;

    public Student(String name, double[] grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public double[] getGrades() {
        return grades;
    }

    public double calculateGPA() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public void printReport() {
        System.out.println("Student Report:");
        System.out.println("Name: " + name);
        System.out.println("Grades:");
        for (double grade : grades) {
            System.out.println(grade);
        }
        System.out.println("GPA: " + calculateGPA());
    }
}
