import java.util.Scanner;
import java.util.regex.Pattern;
public class ClassSheetPattern6 {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern6(n);
    }

    public static void Pattern6(int n) {
        for(int i = n;i>=1;i--){
            for(int j = 0;j<4*(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
