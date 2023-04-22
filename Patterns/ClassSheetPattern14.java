import java.util.*;

public class ClassSheetPattern14 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern14(n);
    }

    public static void Pattern14(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-2;i>=0;i--){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
