import java.util.*;
public class ClassSheetPattern10 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern10(n);
    }

    public static void Pattern10(int n) {
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
