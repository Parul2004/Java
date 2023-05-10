import java.util.*;

public class IsItCatOrNot {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();

        for (int i = 0; i < n; i++) {
            int len = ip.nextInt();
            String str = ip.next();
            if (str.length() != len) {
                System.out.println("No");
                return;
            }
            int f = 0;
            
            for (int j = 0; j <= str.length()+1; j++) {
                if (j == 0 && (str.charAt(j) == 'm' || str.charAt(j) == 'M')) {
                  
                    while (str.charAt(j) == 'm' || str.charAt(j) == 'm') {
                        j++;

                    }
                    if ((str.charAt(j - 1) == 'm' || str.charAt(j - 1) == 'M')
                            && (str.charAt(j) == 'e' || str.charAt(j) == 'E')) {
                       
                        while (str.charAt(j) == 'e' || str.charAt(j) == 'E') {
                            j++;

                        }

                        if ((str.charAt(j - 1) == 'e' || str.charAt(j - 1) == 'E')
                                && (str.charAt(j) == 'o' || str.charAt(j) == 'O')) {
                            
                            while (str.charAt(j) == 'o' || str.charAt(j) == 'O') {
                                j++;
                            }

                            if ((str.charAt(j - 1) == 'o' || str.charAt(j - 1) == 'O')
                                    && (str.charAt(j) == 'w' || str.charAt(j) == 'w')) {
                               
                                while (str.charAt(j) == 'w' || str.charAt(j) == 'W') {
                                    j++;
                                }

                            } else {
                                System.out.println("No");
                            }

                        } else {
                            System.out.println("No");
                        }

                    } else {
                        System.out.println("No");
                    }

                } else {
                    System.out.println("No");
                }

            }
        }
    }
}
