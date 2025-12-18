package Day6;


class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class ValidateAge {
    public static void validate(int age) {
        if (age<0) {
            throw new InvalidAgeException("Age cannot be less than 0");
        }
        System.out.println("Valid age: " + age);
    }
}

public class CustomUnchecked{
    public static void main(String[] args) {
        try {
            ValidateAge.validate(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

}
