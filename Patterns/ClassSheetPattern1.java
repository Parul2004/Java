import java.util.Scanner;

public class ClassSheetPattern1 {

    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern1(n);
        
    }
    public static void Pattern1(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}