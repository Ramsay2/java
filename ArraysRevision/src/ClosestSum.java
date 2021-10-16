import java.util.Arrays;
import java.util.Scanner;

public class ClosestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE, ans = 0;
            for (int i = 0; i < n; i++) {
                int k = i + 1, m = n - 1;
                while (k < m) {
                    int sum = arr[i] + arr[k] + arr[m];

                    if (Math.abs(target - sum) < min) {
                        ans = sum;
                        min = Math.abs(target - sum);
                    }

                    if (sum > target) {
                        m--;
                    }else {
                        k++;

                    }


                }
            }
            System.out.println(ans);
        }
    }
}
