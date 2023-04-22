import java.util.Scanner;
public class ClassSheetPattern12 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        Pattern12(n);
    }

    
    public static void Pattern12(int n) {
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<=n-i-1;j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=2*i-1;j++){
                if(j%2 == 0){
                    System.out.print("! ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
