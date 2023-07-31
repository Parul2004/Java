import java.util.*;

public class HashSetWithoutDataType {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        // Behind the scence Hashing (hashtable) is follwed
        hs.add(1);
        hs.add(43);
        hs.add(4);
        hs.add(9);
        hs.add(3);
        hs.add(1.23);
        hs.add(9);
        hs.add(44);
        hs.add("Parul");
        hs.add(null);

        // allow null values
        // index Based insertion is not allowed
        // not in sorted order
        // order of insertion is not allowed
        // if we want to maintain order of insertion == order of retrive 
        // then LinkedHashSet will have to use.
        System.out.println(hs);
    }
}
