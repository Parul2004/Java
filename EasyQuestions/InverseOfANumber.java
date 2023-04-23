import java.util.*;

public class InverseOfANumber {
    public static void main(String[] args) {
        /*
         * Take the following as input.
         * A number
         * Assume that for a number of n digits, the value of each digit is from 1 to n
         * and is unique. E.g. 32145 is a valid input number.
         * 
         * Write a function that returns its inverse, where inverse is defined as
         * follows
         * 
         * Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543,
         * “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2”
         * is at 4th place.
         * 
         * Print the value returned.
         * 
         * Sample Input
         * 32145
         * 
         * Sample Output
         * 12543
         * 
         * Explanation
         * 
         * Assume that for a number of n digits, the value of each digit is from 1 to n
         * and is unique. E.g. 32145 is a valid input number. Inverse of 32145 is 12543.
         * In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in
         * 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
         * 
         * 
         */

        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        FindInverse(n);

    }

    public static void FindInverse(int n) {
        int maxi = Integer.MIN_VALUE;
        int m = n;
        while (n != 0) {
            if (maxi < (n % 10)) {
                maxi = n % 10;
            }
            n /= 10;
        }
        int[] arr = new int[maxi];
        for (int i = 0; i < maxi; i++) {
            arr[i] = i + 1;
        }
        int[] Ansarr = new int[maxi];
        int j = 0;
        while (m != 0) {
            Ansarr[(m % 10) - 1] = arr[j++];
            m /= 10;
        }

        for(int i = maxi-1;i>=0;i--){
            System.out.print(Ansarr[i]);
        }

    }
}
