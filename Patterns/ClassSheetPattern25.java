import java.util.*;

public class ClassSheetPattern25 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
      
        Pattern24(n);
    }

    public static void Pattern24(int n) {
        int k = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print(k + " ");
                k+=1;
            }
            System.out.println();
        }
    }
}
