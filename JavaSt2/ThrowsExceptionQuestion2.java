import java.util.Scanner;

public class ThrowsExceptionQuestion2 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = ip.nextInt();
        }

        maxiElement(arr);
        miniElement(arr);

        try {
            getsum(arr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void maxiElement(int arr[]) {
        int mazi = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (mazi < arr[i]) {
                mazi = arr[i];
            }
        }
        System.out.println(mazi);
    }

    public static void miniElement(int arr[]) {
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (mini > arr[i]) {
                mini = arr[i];
            }
        }
        System.out.println(mini);
    }


    public static void getsum(int arr[]) throws Exception {
        int diff = arr[0];
        for (int i = 1; i < arr.length; i++) {
          //  System.out.println(diff);
            diff -= arr[i];
        }

        if (diff >= 0) {
            System.out.println(diff);
            throw new Exception("Subtract is greater than equal to Zero");
        } else {
            System.out.println(diff);
            throw new Exception("Subtract is less than zero");
        }
    }

}
