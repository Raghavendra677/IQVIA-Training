package Day4;

class Students {
    String name;
    int rollNo;
    double marks1;
    double marks2;
    int classesAttended;
    int totalClasses;
    Students (String n,int r,double m1,double m2,int c,int total) {
        name = n;
        rollNo = r;
        marks1 = m1;
        marks2 = m2;
        classesAttended = c;
        totalClasses = total;
    }

    double calculateAvg() {
        return (marks1 + marks2) / 2.0;
    }
    char calculateGrade() {
        double avg = calculateAvg();
        if (avg >= 85) return 'A';
        else if (avg >= 70) return 'B';
        else if (avg >= 55) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }
    double attendancePer() {
        if (totalClasses<=0) return 0;
        return (classesAttended * 100.0)/totalClasses;
    }
    void StudentDetails(){
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks:"+marks1+ ", " + marks2);
        System.out.printf("Average: %.2f\n", calculateAvg());
        System.out.println("Grade: " + calculateGrade());
        System.out.printf("Attendance: %f", attendancePer());
    }
}
public class StudentGradesAttendance{
    public static void main(String[] args) {

        Students s1 = new Students("Raghav", 101, 86.5, 78.0, 42, 45);
        Students s2 = new Students("Prajwal", 102, 62.0, 58.5, 30, 40);
        s1.StudentDetails();
        s2.StudentDetails();
    }
}

