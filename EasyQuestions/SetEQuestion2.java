import java.util.*;
public class SetEQuestion2 {
 public static void main(String[] args) {
    
    Scanner ip = new Scanner(System.in);
    int n = ip.nextInt();
    int m = ip.nextInt();

    int arr1[] = new int[n];
    int arr2[] = new int[m];

    for(int i = 0;i<n;i++){
        arr1[i] = ip.nextInt();
    }

    for(int i = 0;i<m;i++){
        arr2[i] = ip.nextInt();
    }

    HashSet<Integer>s = new HashSet<>();
    for(int i = 0;i<n;i++){
        s.add(arr1[i]);
    }

    for(int i = 0;i<m;i++){
        s.add(arr2[i]);
    }

    System.out.println("Union is : ");
    System.out.println(s);
    System.out.println("\nSize of Union of two Array is : "+s.size());
    System.out.println();

 }   
}
