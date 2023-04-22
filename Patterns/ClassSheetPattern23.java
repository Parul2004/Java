import java.util.*;
import java.util.regex.Pattern;
public class ClassSheetPattern23 {
    public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      int n = ip.nextInt();
      
      Pattern23(n);
    }

    public static void Pattern23(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 0;j<2*i+1;j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
