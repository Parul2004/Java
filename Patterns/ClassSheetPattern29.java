import java.util.Scanner;

public class ClassSheetPattern29 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern29(n);
    }
    public static void Pattern29(int n) {
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print("  ");
            }

            for(int j = 0;j<2*i+1;j++){
                if(j == 0 || j == 2*i){
                    System.out.print(i+1 + " ");
                }
                else{
                    System.out.print("0 ");
                }
                
            }
            System.out.println();
        }
    }
}
