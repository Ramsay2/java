package PracticeBinary;

import java.util.Scanner;

public class FindCeiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(findMin(arr, n, m));
    }

    public static int findMin(int[] arr, int n, int m) {
        int start = 0, end = n;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < m) start = mid + 1;
            if (arr[mid] >= m) {
                end = mid - 1;
                ans = mid;
            }
        }
        return ans;
    }
}
