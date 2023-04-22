import java.util.*;
import java.util.regex.Pattern;
public class ClassSheetPattern30 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern30(n);
    }

    public static void Pattern30(int n) {
        for(int i = n;i>=1;i--){
            for(int j = n;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
