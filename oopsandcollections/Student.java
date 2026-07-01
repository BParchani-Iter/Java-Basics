package oopsandcollections;

public class Student {
    String name;
    int id;
    double gpa;
    String department;

    public Student(String name, int id, double gpa, String department) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', id=" + id + ", gpa=" + gpa + ", dept=" + department + "}";
    }
}
