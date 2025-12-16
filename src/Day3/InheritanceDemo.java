package Day3;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Child extends Person {
    double marks;

    public Child(String name, int age, double marks) {
        super(name, age);
        this.marks=marks;
    }

    public void displayChildInfo() {
        displayPersonInfo();
        System.out.println("Marks: " + marks);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child("Raghu", 15, 88.5);
        c.displayChildInfo();
    }
}

