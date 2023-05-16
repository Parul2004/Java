public class AestriodDivision {
    public static void main(String[] args) {
        int arr[] = {-2,-1,1,2};

        int i = 0, j = 0, e = arr.length;
        // int ans[] = new int[arr.length], l = 0;

        while ((i >= 0 && i < e) && (j < e && j >= 0)) {

            if (arr[j] > 0 && arr[j + 1] > 0) {
                j++;

            } 
            // else if ((arr[j] > 0 && arr[j + 1] < 0) || (arr[j] < 0 && arr[j + 1] > 0) || Math.abs(arr[j]) == Math.abs(arr[j + 1])) {
            
             else{
                i = j;
                if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                    for (int l1 = i; l1 < e - 1; l1++) {
                        arr[l1] = arr[l1 + 1];
                    }
                    e = e - 1;
                    j = j - 1;
                }
                 else if (Math.abs(arr[j]) == Math.abs(arr[j + 1])) {
                   
                    int c = j;
                    for (int q = c; q < e - 1; q++) {
                        arr[q] = arr[q + 1];
                    }

                    System.out.println("Element are : ");
                    for(int kk = 0;kk<e;kk++){
                        System.out.print(arr[kk]+" ");
                    }

                    System.out.println();
                    e = e - 1;
                    c = j;
                   if(e-1 == j){
                    arr[j] = 0;
                   }
                    for (int q = c; q < e - 1; q++) {
                        arr[q] = arr[q + 1];
                    }
                    e = e - 1;
                    j = j - 1;
                    System.out.println(j);
                    // System.out.println(j-1);

                }
                 else {
                    if (Math.abs(arr[j]) > Math.abs(arr[j + 1])) {
                        int f = 1;
                        for (int l1 = i + 1; l1 < e - 1; l1++) {
                            f = 0;
                            arr[l1] = arr[l1 + 1];
                        }
                        e = e - 1;
                        if(f == 0)   j = j - 1;
                        else j = j+1;
                        
                      
                        // from stack
                        // from 2 pointer
                        for (int a = 0; a < e; a++) {
                        System.out.print(arr[a] + " ");
                        }
                        System.out.println();
                    }
                }

                // minimum window substring
                // maximum rectangular historgram
            }
          /*   else if((arr[j] < 0 && arr[j + 1] < 0)){
                      
               
                    i = j;
                    if (Math.abs(arr[j]) < Math.abs(arr[j + 1])) {
                        for (int l1 = i; l1 < e - 1; l1++) {
                            arr[l1] = arr[l1 + 1];
                        }
                        e = e - 1;
                        j = j - 1;
                    }
                     else if (Math.abs(arr[j]) == Math.abs(arr[j + 1])) {
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
                        j = j - 1;
                        // System.out.println(j-1);
    
                    }
                     else {
                        if (Math.abs(arr[j]) > Math.abs(arr[j + 1])) {
                            int f = 1;
                            for (int l1 = i + 1; l1 < e - 1; l1++) {
                                f = 0;
                                arr[l1] = arr[l1 + 1];
                            }
                            e = e - 1;
                            if(f == 0 && j!=0)   j = j - 1;
                            else if(f==1) j = j+1;
                            
                          
                            // from stack
                            // from 2 pointer
                            for (int a = 0; a < e; a++) {
                            System.out.print(arr[a] + " ");
                            }
                            System.out.println();
                        }
                    }
            }
            */
          
        }

        for (int i1 = 0; i1 < e; i1++) {
            System.out.print(arr[i1] + " ");
        }

    }
}
