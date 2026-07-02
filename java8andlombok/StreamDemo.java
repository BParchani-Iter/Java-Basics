package java8andlombok;

import java.util.*;
import java.util.stream.*;
import java.util.Comparator;

class Employee {
    private String name;
    private double salary;
    private String department;

    public Employee(String name, double salary, String department){
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return name + "(" + department + ") - $" + salary;
    }
}

public class StreamDemo{
    public static void main(String[] args){
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000, "IT"),
                new Employee("Bunny", 82000, "Finance"),
                new Employee("Charlie", 65000, "IT"),
                new Employee("Daniel", 90000, "Finance"),
                new Employee("Evelyn", 72000, "HR")
        );

        List<Employee> highEarners = employees.stream()
                .filter(e -> e.getSalary() > 70000)
                .toList();
        System.out.println("High Earners: " + highEarners);

        List<String> departments = employees.stream()
                .map(Employee::getDepartment)
                .distinct()
                .toList();
        System.out.println("Departments: " + departments);

        double avgSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("Average Salary: " + avgSalary);

        Map<String, List<Employee>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Grouped by Department: " + groupedByDept);

        Optional<Employee> highestPaid = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        highestPaid.ifPresentOrElse(
                e -> System.out.println("Highest Paid: " + e),
                () -> System.out.println("No employees found")
        );

        List<String> upperNames = employees.stream()
                .map(Employee::getName)
                .map(String::toUpperCase)
                .toList();
        System.out.println("Uppercase Names: " + upperNames);
    }

}

