
import java.util.*;
public class ClassSheetPattern16 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern16(n);
    }

    public static void Pattern16(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<2*(n-i-1);j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1;i<n;i++){
            for(int j = 0;j<2*(i);j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
