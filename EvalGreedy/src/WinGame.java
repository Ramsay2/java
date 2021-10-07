import java.util.Arrays;
import java.util.Scanner;

public class WinGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) arr2[i] = sc.nextInt();

        Arrays.sort(arr);
        Arrays.sort(arr2);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= arr2[m - 1]) {
               ans += arr2[m - 1] - arr[i] + 1;
            }
        }
        System.out.println(ans);
    }
}
