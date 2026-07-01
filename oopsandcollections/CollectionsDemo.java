package oopsandcollections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anushka", 101, 3.4, "CS" ));
        students.add(new Student("Bruno", 102, 1.8, "Math"));
        students.add(new Student("Champi", 103, 2.7, "Physics"));
        students.add(new Student("Diya", 104, 3.9, "CS"));
        students.add(new Student("Pranjal", 105, 1.5, "Biology"));
        students.add(new Student("Fayal", 106, 1.8, "Math"));

        students.removeIf(s-> s.gpa < 2.0);

        //hashmap
        Map<Integer, Student> studentMap = new HashMap<>();
        for (Student s: students) studentMap.put(s.id, s);

        //treemap
        TreeMap<Double, String> gpaMap = new TreeMap<>();
        for (Student s: students) gpaMap.put(s.gpa, s.name);

        //hashset
        HashSet<String> departments = new HashSet<>();
        for (Student s: students) departments.add(s.department);

        System.out.println("ArrayList:");
        for (Student s : students) System.out.println(s);

        System.out.println("\nHashMap:");
        for (Map.Entry<Integer, Student> e : studentMap.entrySet())
            System.out.println("ID=" + e.getKey() + " -> " + e.getValue());

        System.out.println("\nTreeMap:");
        for (Map.Entry<Double, String> e : gpaMap.entrySet())
            System.out.println("GPA=" + e.getKey() + " -> " + e.getValue());

        System.out.println("\nHashSet:");
        for (String dept : departments) System.out.println(dept);

        //performance test
        int N = 100_000;
        long start, end;

        List<Integer> arrayList = new ArrayList<>();
        start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        end = System.nanoTime();
        System.out.println("\nArrayList add time: " + (end - start) / 1_000_000 + " ms");

        List<Integer> linkedList = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        end = System.nanoTime();
        System.out.println("LinkedList add time: " + (end - start) / 1_000_000 + " ms");

        //sort with custom comparator
        students.sort(new ReverseNameComparator());
        System.out.println("\nStudents sorted by name (reverse alphabetical):");
        for (Student s : students) System.out.println(s);

    }
}