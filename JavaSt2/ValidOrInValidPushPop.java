import java.util.*;

public class ValidOrInValidPushPop {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }
        Stack<Integer> s = new Stack<>();
        String ans = "Valid";
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                s.push(arr[i]);
            } else if (arr[i] == 0) {
                if (s.isEmpty()) {
                    ans = "InValid";
                    break;
                }
                s.pop();
            }
        }
        System.out.println(ans);
    }
}
