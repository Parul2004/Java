public class NextGreaterElementLeetcode {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1 };
        int ans[] = new int[arr.length], l = 0;
        int flag = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                continue;
            } else {
                flag = 0;
                break;
            }
        }
        if(flag == 1){
            for(int i = 0;i<arr.length;i++){
                if(i==0){
                    ans[l++] = -1;
                }
                else{
                    ans[l++] = arr[0];
                }
            }
        }
        else{
        for (int i = 0; i < arr.length; i++) {
            int f = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    f = 1;
                    ans[l++] = arr[j];
                    break;
                }
            }
            if (f == 0) {

                for (int j = 0; j < i; j++) {
                    if (arr[i] < arr[j]) {
                        f = 1;
                        ans[l++] = arr[j];
                        break;
                    }
                }
            }

            if (f == 0)
                ans[l++] = -1;
            }
        }

        for (int i = 0; i < l; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
