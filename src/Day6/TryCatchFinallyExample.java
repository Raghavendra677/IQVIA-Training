package Day6;


public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int number= 10/0;
            System.out.println("Result:"+number);
        } catch (ArithmeticException e) {
            System.out.println("Error:Division by zero is not allowed.");
        } finally {
            System.out.println("This block always executes.");
        }
    }

}
