public class SwapingTwoElementsOfArrayByvalue {
    public static void main(String[] args) {
        int []arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        System.out.print(arr[0]+" "+arr[1]+"\n");
        pass_by_reference(arr[0],arr[1]);
        System.out.print(arr[0]+" "+arr[1]);
    }
  // this will not swap the elements because it is passed by value
    public static void pass_by_reference(int a,int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
