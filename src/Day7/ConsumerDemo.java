package Day7;


import java.util.function.Consumer;

class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Raghu", 10000);

        Consumer<Employee> hikeSalary = e -> {
            e.salary = e.salary + 5000;
        };
        Consumer<Employee> updateSalary = e -> {
            System.out.printf(e.name+" new salary is "+e.salary);
        };

        hikeSalary.andThen(updateSalary).accept(emp);

    }
}


