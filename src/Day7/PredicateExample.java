package Day7;


import java.util.function.Predicate;

class EvenCheck implements Predicate<Integer> {
    @Override
    public boolean test(Integer num) {
        return num % 2 == 0;

    }
}

public class PredicateExample{
    public static void main(String[] args) {
        Predicate<Integer> C = new EvenCheck();

        Predicate<String> nameStartsWithA = name -> name.startsWith("A");
        boolean alice = nameStartsWithA.test("Alice");
        boolean bob = nameStartsWithA.test("Bob");

        if (C.test(11)) {
            System.out.println("number is even.");
        } else {
            System.out.println("number is odd.");
        }
    }

}
