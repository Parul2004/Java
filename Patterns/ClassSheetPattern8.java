import java.util.Scanner;
public class ClassSheetPattern8 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
 
        Pattern7(n);
    }
    public static void Pattern7(int n) {
       
        for(int i = 1;i<=n;i++){
           
            if(i == (n/2)+1){

              for(int j = 0;j<n;j++){
                if(j+1 == i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
              }

            }
            else if(i%2==0){
                for(int j = 0;j<n;j++){
                    if(j == 1 || j == n-2){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
            }
            else{
                      
                for(int j = 0;j<n;j++){
                    if(j == 0 || j == n-1){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
    
            }
        
            System.out.println();
        }
    }
}
