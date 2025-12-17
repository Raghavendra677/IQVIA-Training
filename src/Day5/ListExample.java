package Day5;


import java.util.*;

public class ListExample{
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        System.out.println(fruits);
        System.out.println(fruits.get(1));
    }
}
