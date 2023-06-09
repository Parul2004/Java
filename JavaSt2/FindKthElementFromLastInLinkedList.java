import java.util.*;
public class FindKthElementFromLastInLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>();
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();
        while(n!=0){
            int a = ip.nextInt();
            arr.add(a);
            n--;
        }

        int k = ip.nextInt();

        int s = arr.size();

        System.out.println(arr.get(s-k));
    }
}
