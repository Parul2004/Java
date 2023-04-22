public class SwapingTwoElementsByReference {
    public static void main(String[] args) {
        int []arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.print(arr[0]+" "+arr[1]+"\n");
        pass_by_reference(arr);
        System.out.print(arr[0]+" "+arr[1]);
    }

    public static void pass_by_reference(int arr[]) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
