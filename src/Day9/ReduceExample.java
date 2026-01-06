package Day9;


import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class ReduceExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raghu", 95000),
                new Employee("Naveen", 85000)
        );

        double totalSalary = employees.stream()
                .map(e -> e.salary)
                .reduce(0.0 , (sum, sal) -> sum + sal);

        System.out.println("Total Salary: $" + totalSalary);
    }
}


