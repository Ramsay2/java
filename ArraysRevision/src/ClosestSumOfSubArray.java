import java.util.Scanner;

public class ClosestSumOfSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            int min = Integer.MAX_VALUE , ans = 0;
            for (int i = 0; i < n - 2; i++) {
                int  sum = arr[i] + arr[i + 1] + arr[i + 2];
                if (Math.abs(sum - target) < min) {
                    ans = sum;
                    min = Math.abs(sum - target);
                }
            }
            System.out.println(ans);

        }
    }
}
