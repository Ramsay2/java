import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(findIndex(arr,k, n - 1));
    }

    public static int findIndex(int[] arr, int k, int n) {
        int start = 0, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] <= arr[end]) {
                if (arr[mid] < k && arr[end] >= k) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            if (arr[start] <= arr[mid]) {
                if (arr[mid] > k && arr[start] <= k) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
