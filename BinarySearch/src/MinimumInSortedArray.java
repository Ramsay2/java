import java.util.Scanner;

public class MinimumInSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(findIndex(arr, n));

    }

    public static int findIndex(int[] arr, int n) {
        int start = 0, end = n - 1;

        if (arr[start] < arr[end]) return arr[start];

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid - 1] > arr[mid]) {
                return arr[mid];
            }

        }
        return 0;
    }
}