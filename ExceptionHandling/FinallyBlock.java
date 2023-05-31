
import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int k = ip.nextInt();

        try{
            System.out.println(100/k);
        }
        catch(Exception p){
            System.out.println("I can handle u ok 😋😋");
        }
        finally{
            System.out.println("my name is kinmeen");
        }
    }
}
