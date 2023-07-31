import java.util.*;

public class PriorityQueueWithoutDataType {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(1);
        pq.add(41);
        pq.add(87);
        pq.add(7);
        pq.add(45);
        pq.add(87);
        // pq.add("PArul"); Error
        // we can only add homogenous data Type
        // we can add duplicates aldo
        // behind the scence Priority Queue follow min-Heap Property
        // Element are not in sorted order
        // order of insertion is not maintained
        // Priority Queue doesn't allow null values 

        // pq.add(null); Error
        System.out.println(pq);
    }
}
