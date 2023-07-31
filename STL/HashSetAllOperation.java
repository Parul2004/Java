import java.util.*;
import java.util.Collections;
import java.util.HashSet;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class HashSetAllOperation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
       
        set.add(45);
        set.add(9);
        set.add(54);
        set.add(32);

        Iterator<Integer>itr = set.iterator();
        System.out.println("Set Having elements : ");
        
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        // printing set
        System.out.println(set);

        // size of set
        System.out.println(set.size());

        // contains() method check if element is present or not
        System.out.println(set.contains(32));

        // removeing the element
        set.remove(32);
        System.out.println(set);

        // Iterating over hashSet items
        // Iterator<Integer> i = set.iterator();
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }

        HashSet<Integer> set1 = new HashSet<>(set);
        
        System.out.println(set.isEmpty());

        ArrayList<Integer>arr = new ArrayList<>(set);
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(set.equals(set1));

    }
}
