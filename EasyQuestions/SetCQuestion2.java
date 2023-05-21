import java.util.*;
public class SetCQuestion2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();
        int arr[][] = new int[n][m];

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                arr[i][j] = ip.nextInt();
            }
        }

        int k = ip.nextInt();

        int flag = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(arr[i][j] == k){
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 1){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
