import java.util.Arrays;
import java.util.Scanner;

public class SearchNumber {
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();
        while (m-- != 0) {
            int q = sc.nextInt();
            int target = sc.nextInt();
            findN(arr, 0, target);
            if (count == 0) {
                System.out.println(0);
            } else if (q == 0) {
                System.out.println(n - findN(arr, 0, target));
            } else if (q == 1) {
                System.out.println(n - findN(arr, 0, target) - 1);
            }
        }
    }

    public static int findN(int[] array, int low, int k) {

        Arrays.sort(array);
        int mid, ans = 0;
        int high = array.length - 1;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (array[mid] == k) {
                ans = mid;
                high = mid - 1;
            } else if (array[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}




