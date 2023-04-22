import java.util.Scanner;

public class ClassSheetPattern3 {
    //ClassSheetPattern2.java
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern3(n);
    }

    public static void Pattern3(int n) {
        for(int i = n;i>=1;i--){
            for(int j = 0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
