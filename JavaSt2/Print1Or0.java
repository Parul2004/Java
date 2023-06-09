import java.util.*;

public class Print1Or0 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int arr[] = new int[n];
      
        
        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }

        HashMap<Integer,Integer> m = new HashMap<>();
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(m.containsKey(arr[i])){
                ans = 1;
                break;
            }
            else{
                m.put(arr[i], 1);
            }
        }

        System.out.println(ans);




    }
}
