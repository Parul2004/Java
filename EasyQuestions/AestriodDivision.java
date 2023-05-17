public class AestriodDivision {
    public static void main(String[] args) {
        int arr[] = {-2,-1,-1,-2};

        int i = 0, j = 0, e = arr.length;

        while ((i >= 0 && i < e) && (j < e && j >= 0)) {

            if (arr[j] > 0 && arr[j + 1] > 0) {
                j++;
                if(j==e-1) break;

            }
            else if(arr[j]<0 && arr[j+1]<0){
                j++;
                if(j==e-1) break;
            }
            else if(arr[j]<0 && arr[j+1]>0){
                j++;
                if(j==e-1) break;
            }
             else if (arr[j] > 0 && arr[j + 1] < 0) {
                i = j;
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                    for (int l1 = i; l1 < e - 1; l1++) {
                        arr[l1] = arr[l1 + 1];
                    }
                    e = e - 1;
                    if(j!=0){
                        j = j - 1;
                    }
                   
                } else if (Math.abs(arr[j]) == Math.abs(arr[j + 1])) {
                    int c = j;
                    for (int q = c; q < e - 1; q++) {
                        arr[q] = arr[q + 1];
                    }
                    e = e - 1;
                    c = j;
                    for (int q = c; q < e - 1; q++) {
                        arr[q] = arr[q + 1];
                    }
                    e = e - 1;
                    if(j!=0)  j = j - 1;
                   
                    // System.out.println(j-1);

                } else {
                    if (Math.abs(arr[j]) > Math.abs(arr[j + 1])) {
                        int f = 1;
                        for (int l1 = i + 1; l1 < e - 1; l1++) {
                            f = 0;
                            arr[l1] = arr[l1 + 1];
                        }
                        e = e - 1;
                        if (f == 0 && j!=0)
                            j = j - 1;
                        else if(f == 0 && j==0){

                        }
                        else
                            j = j + 1;
                    }
                }

            }

        }

        int ans[] = new int[e];
        int pa = 0;
        for (int i11 = 0; i11 < e; i11++) {
            if (arr[i11] > 0) {
                ans[pa++] = arr[i11];
            } else {
                continue;
            }

        }

        for (int i1 = 0; i1 < e; i1++) {
            System.out.print(arr[i1] + " ");
        }

    }
}
