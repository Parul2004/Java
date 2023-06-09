import java.util.*;

public class ContainsTripletSumOrNot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        int n = ip.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }

        boolean ans= false;
        for(int i = 0;i<n-1;i++){
            HashSet<Integer>s = new HashSet<>();
            for(int j = i+1;j<n;j++){
                int x = -(arr[i]+arr[j]);
                if(s.contains(x)){
                    ans = true;
                    break;
                }
                else{
                    s.add(arr[j]);
                }
            }
        }

        System.out.println(ans);

    }
}
