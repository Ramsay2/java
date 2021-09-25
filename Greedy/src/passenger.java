import java.util.Arrays;
import java.util.Scanner;

public class passenger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int ans = 0;
            Arrays.sort(arr);
            int i, j;
            for (i = 0, j = n - 1; i < j; ) {
                if (arr[i] + arr[j] <= k) {
                    ans++;
                    i++;
                    j--;
                } else {
                    ans++;
                    j--;
                }
            }
            if (i == j) {
                ans += 1;
            }
            System.out.println(ans);
        }
    }
}
