package Day9;


import java.util.*;
import java.util.stream.*;

class Employees {
    String name;
    List<String> skills;

    Employees(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}

public class FlatMapExample {
    public static void main(String[] args) {
        List<Employees> employees = Arrays.asList(
                new Employees("Raghu", Arrays.asList("Java", "Spring")),
                new Employees("Prajwal", Arrays.asList("Python", "Django"))
        );

        List<String> allSkills = employees.stream()
                .flatMap((e) -> e.skills.stream())
                .collect(Collectors.toList());

        System.out.println("All Skills: " + allSkills);
    }
}

