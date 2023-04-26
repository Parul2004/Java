import java.util.*;

public class ArraysSpiralPrintAnticlockwise {

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

        int scol = 0, ecol = m - 1, srow = 0, erow = n - 1;

        int total_num = n * m, count = 0;

      while(count<total_num){

    

            for (int i = srow; i <= erow && count < total_num; i++) {
                System.out.print(arr[i][scol] + " ");
                count++;
            }
           
            scol++;

            for (int i = scol; i <= ecol && count < total_num; i++) {
                System.out.print(arr[erow][i] + " ");
                count++;
            }
            erow--;

            for (int i = erow; i >= srow && count < total_num; i--) {
                System.out.print(arr[i][ecol] +" ");
                count++;
            }
            
            ecol--;

            for (int i = ecol; i >= scol && count < total_num; i--) {
                System.out.print(arr[srow][i]+" ");
                count++;
            }
            
            srow++;
        }
        
        
    }

}
