package Day5;


import java.util.*;

public class MapExample{
    public static void main(String[] args) {
        Map<Integer, String> idToName= new HashMap<>();
        idToName.put(1, "Apple");
        idToName.put(2, "Banana");
        idToName.put(1, "Cherry"); // key 1 updated
        System.out.println(idToName); // 1=Cherry, 2=Banana
        System.out.println(idToName.get(2)); // Access by key
    }
}

