import java.util.Arrays;
import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(upperBound(arr, n, k));

    }

    private static int upperBound(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int start = 0, end = n, mid;

        int ans = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] > k) {
                ans = mid;
                end = mid - 1;
            } else if (mid < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }


}