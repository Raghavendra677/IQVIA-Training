package Day9;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeCSVProcessor {


    static class Employee {
        String name;
        String department;
        int experience;
        double salary;

        Employee(String name, String department, int experience, double salary) {
            this.name = name;
            this.department = department;
            this.experience = experience;
            this.salary = salary;
        }
    }
    public static void main(String[] args) throws Exception{
    Path filePath=Path.of("C:\\Users\\u1215839\\Downloads\\employees.csv");
    List<Employee> employees=Files.lines(filePath)
            .skip(1)
            .map(line ->line.split(","))
            .map(data -> new Employee(
                    data[1],data[4],Integer.parseInt(data[6]),Double.parseDouble(data[7])
            ))
            .collect(Collectors.toList());

        System.out.println("IT Employees: ");
        employees.stream()
                .filter(e -> e.department.equals("IT"))
                .forEach(e -> System.out.println(e.name));

        System.out.println("\n High Salary Employees: ");
        employees.stream()
                .filter(e -> e.salary > 60000)
                .forEach(e -> System.out.println(e.name + ":" +e.salary));

    }
}