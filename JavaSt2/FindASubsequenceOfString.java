import java.util.*;

public class FindASubsequenceOfString {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        String given = ip.next();
        String find = ip.next();

        System.out.println(given.indexOf(find));
    }
}
