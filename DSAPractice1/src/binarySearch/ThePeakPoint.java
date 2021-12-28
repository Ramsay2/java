package binarySearch;

import java.util.Scanner;

public class ThePeakPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findPeak(arr));
        }
    }

    private static int findPeak(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
          int  mid = low + (high - low) / 2;
            if (mid == 0 || mid == arr.length - 1) {
                return mid;
            }
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
