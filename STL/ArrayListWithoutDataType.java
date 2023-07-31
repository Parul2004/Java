import java.util.*;

public class ArrayListWithoutDataType {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();

        al1.add(10);
        al1.add(2);
        al1.add("Parul");
        al1.add(0, 'a');
        // order is maintained
        // we can heterogenous type of data
        System.out.println(al1);

        ArrayList al2 = new ArrayList();
        al2.add("Parul");
        al2.add("Sura");
        al2.add(1.1);
        al2.addAll(al1);
        
        System.out.println(al2);

    }
}
