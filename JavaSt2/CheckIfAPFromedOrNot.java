import java.util.*;

public class CheckIfAPFromedOrNot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = ip.nextInt();
        }

        Arrays.sort(arr);
        int d = arr[1]-arr[0];
        String flag = "Yes";
        for(int i = 2;i<n;i++){
            if(arr[i]-arr[i-1] != d){
                  flag = "No";
                  break;
            }
        }

        System.out.println(flag);
    }
}
