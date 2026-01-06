package Day8;


import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Employees {
    String name;
    String department;

    Employees(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name +"("+ department + ")";
    }
}

public class GroupingByExample {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Raghu", "IT"),
                new Employees("Naveen", "IT"),
                new Employees("Vaibhav", "HR"),
                new Employees("Rohit", "HR"),
                new Employees("Harish", "IT"),
                new Employees("Sachin", "HR")
        );

        Map<String, List<Employees>> groupedByDept = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));

        System.out.println(groupedByDept.get("IT"));
    }
}


