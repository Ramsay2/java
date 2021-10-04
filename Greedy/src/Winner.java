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

            List<Integer> s1, s2;
            int ans = n + 1, pc = 1000000;
            for (int i = 0; i < n; i++) {

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

