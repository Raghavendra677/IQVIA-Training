
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        System.out.print("\nStudent Details");
        System.out.printf("\nName  : %s", name);
        System.out.printf("\nAge   : %d", age);
        System.out.printf("\nMarks : %d", marks);

    }
}
