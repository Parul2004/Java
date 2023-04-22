import java.util.*;

public class ClassSheetPattern28 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern28(n);
    }

    public static void Pattern28(int n) {
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k = i;
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
               
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k+=1;
            }
            int a = k;
            if(i>1){
                for (int j = a-1; j > i; j--) {
                    System.out.print(j-1+" ");
                    
                }
            }
           
            System.out.println();
        }
    }
}
