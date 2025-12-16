package Day1;

class StudentPrivate{
    String name;
        int rollNo;
        int marks1;
        int marks2;

        StudentPrivate(String n,int r,int m1,int m2) {
            name = n;
            rollNo = r;
            marks1 = m1;
            marks2 = m2;
        }

        void Details() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks:" + marks1 + "," + marks2);

            }
    }

    public class StudentAvg{
        public static void main(String[] args) {
            StudentPrivate s=new StudentPrivate("Raghu",22, 78, 88);
            s.Details();

        }
    }


