package Day7;


import java.util.function.Supplier;

class Employee1 {
    public String name;
    public int salary;

    public Employee1(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Employee> createEmployee = () -> new Employee("Raghu", 10000);

        Employee emp = createEmployee.get();

        System.out.println(emp.name);
        System.out.println(emp.salary);

    }

}
