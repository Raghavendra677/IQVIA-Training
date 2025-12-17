package Day5;


import java.util.*;

class Student1 {
    int id;
    String name;

    Student1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));
        Comparator<Student> byName = (s1, s2) -> s1.name.compareTo(s2.name);
        Collections.sort(students, byName);
        System.out.println("By name: " + students);
        Comparator<Student> byId = (s1, s2) -> Integer.compare(s1.id, s2.id);
        Collections.sort(students, byId);
        System.out.println("By id:   " + students);
    }

}
