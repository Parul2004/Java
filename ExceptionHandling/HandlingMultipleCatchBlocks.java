import java.util.*;

public class HandlingMultipleCatchBlocks {
    public static void main(String[] args) {
        int arr[] = new int[3];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter Array Index");
        int idx = ip.nextInt();
        System.out.println("Enter the number u want to divide to : ");
        int num = ip.nextInt();
        try {
            System.out.println("The value at Array index : " + arr[idx]);
            System.out.println("The value of array_value/num is : " + arr[idx] / num);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException p) {
            System.out.println(p);
        } catch (Exception c) {
            System.out.println(c);
        }
    }
}
