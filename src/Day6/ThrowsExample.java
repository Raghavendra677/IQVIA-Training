package Day6;


public class ThrowsExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }
}




