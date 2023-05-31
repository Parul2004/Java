
import java.util.*;
class TryCatch{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        try{
            int c = ip.nextInt();
            int ans = 1000/c;
            System.out.println("Value of ans is : "+ans);
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Cannot divided by zero");
        }

        System.out.println("hello Parul");
    }
}