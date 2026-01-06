package Day10;

final class StudentRecords{
    private final int id;
    private final String name;
    private final double marks;

    public StudentRecords(int id, String name, double marks) {
        this.id = id;
        this.name = name.trim();
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        StudentRecords student1 = new StudentRecords(101, "Raghavendra", 92.5);
        System.out.println("ID: " + student1.getId() +
                ", Name: " + student1.getName() +
                ", Marks: " + student1.getMarks());
    }
}


