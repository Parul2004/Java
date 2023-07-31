import java.util.*;

public class TreeSetWithoutDataType {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(3);
        ts.add(97);
        ts.add(0);
        ts.add(0);
        ts.add(7);

        // order of insertion not maintained
        // o/p will be in sorted order
        // TreeSet internally follow BST (InORder Traversal)
        // Duplicates are not allowed
        // cann't add null values
        // ts.add(null); Error

        
        System.out.println(ts.higher(28));
        System.out.println(ts.lower(28));
        
        System.out.println(ts.ceiling(28));
        System.out.println(ts.floor(28));

        System.out.println(ts.ceiling(7));
        System.out.println(ts.floor(7));

        System.out.println(ts);
    }
}
