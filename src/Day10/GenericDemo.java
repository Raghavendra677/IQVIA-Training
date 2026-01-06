package Day10;



class Box<T> {
    private T value;

    public Box(T value) {

        this.value = value;
    }
    public T getValue() {

        return value;
    }
    public static <U> void printValue(U val) {
        System.out.println("Value: " + val);
    }
}

public class GenericDemo {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>("Hello");
        System.out.println("String in box: " + stringBox.getValue());

        Box<Integer> intBox = new Box<>(42);
        System.out.println("Integer in box: " + intBox.getValue());

        Box.printValue(123);
        Box.printValue(3.14);
    }
}

