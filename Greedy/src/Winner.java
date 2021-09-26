import java.util.*;

public class Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(1);
                return;
            }

            int ans = 0;
            for (int i : arr) {
                ans ^= i;
            }
            System.out.println(ans);
            for (int i = 0; i < n; i++) {

             /*   for (int j = i + 1; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        break;
                    }
                }*/

            }


        }
    }

}

