import java.util.*;
public class NearestMultipleOf10 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int s = ip.nextInt();
        int d = s%10;
        if(d<5){
            System.out.println(s-d);
        }
        else{
            System.out.println(s+(10-d));
        }
        
    }
}
