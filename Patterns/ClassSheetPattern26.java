import java.util.*;
public class ClassSheetPattern26 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern26(n);
    }
    public static void Pattern26(int n) {
        int k = 1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print(k + " ");
                k+=1;
            }
            k = 1;
            System.out.println();
        }
    }
}
