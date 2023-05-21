import java.util.*;

public class SetDQuestion2 {
    public static void main(String[] args) {

        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int m = ip.nextInt();

        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = ip.nextInt();
            }
        }

        for(int i = 0;i<n;i++){
          
                int t = arr[i][m-1];
                arr[i][m-1] = arr[i][0];
                arr[i][0] = t;
        }

        System.out.println("After reverting column will be : ");
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
