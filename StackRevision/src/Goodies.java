import java.util.Scanner;

public class Goodies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long m = sc.nextInt();
        minG(arr, n, m);
    }

    private static void minG(long[] arr, long m, long h) {

        long start = 0;
        long end = (long) Math.pow(10, 9);
        long ans = Integer.MAX_VALUE;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isValid(arr, m, h, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);


    }

    private static boolean isValid(long[] arr, long m, long h, long mid) {
        long totalh = 0;
        for (int i = 0; i < m; i++) {
            totalh += arr[i] / mid;
            if (arr[i] % mid != 0) {
                totalh++;
            }
            if (totalh > h) {
                return false;
            }
        }
        return true;
    }
}