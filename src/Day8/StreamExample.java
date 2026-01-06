package Day8;


import java.util.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ": $" +(long)salary;
    }
}
public class StreamExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raghu", 95000),
                new Employee("Naveen", 85000),
                new Employee("Rohit", 65000),
                new Employee("Vaibhav", 72000),
                new Employee("Harish", 99000),
                new Employee("Abhishek", 78000)
        );

        employees.stream()
                .filter(e -> e.salary >= 80000)
                .sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))
                .forEach(System.out::println);
    }
}


