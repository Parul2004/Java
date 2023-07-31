import java.util.*;

public class ArrayDequeWithoutDataType {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();

        ad.add('a');
        ad.add('i');
        ad.add('e');
        ad.add('o');
        ad.add('u');
        ad.add("Parul");
        ad.add(1.23);
        ad.add(43);
        // index operation is not allowed in deque;

        ad.addFirst("Sura");
        ad.addLast("Lokesh");
        System.out.println(ad);

        ArrayDeque ad2 = new ArrayDeque();
        ad2.add(3);
        ad2.add(889);
        ad2.addAll(ad);

        ad2.offer("Harsh");
        ad2.offerFirst("Aarju");
        ad2.offerLast("Deepti");

        System.out.println(ad2);

        ad2.removeFirst();
        ad2.remove("Harsh");
        ad2.removeAll(ad);
        ad2.remove("Deepti");

        // index opertion is not allowed
        // ArrayDeque internally follow double ended queue 
        System.out.println(ad2);

    }
}
