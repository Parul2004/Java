import java.util.*;

public class LinkedHashSetWithoutDataType {
    public static void main(String[] args) {
        LinkedHashSet lhs = new LinkedHashSet();
        // Order of insertion is followed in LinkedHashSet
        // allow null values
        // duplicates Elements not allowed
        lhs.add(43);
        lhs.add(98);
        lhs.add(3);
        lhs.add(8);
        lhs.add(34);
        lhs.add(null);
        lhs.add(232);
        lhs.add(232);
        System.out.println(lhs);
    }
}
