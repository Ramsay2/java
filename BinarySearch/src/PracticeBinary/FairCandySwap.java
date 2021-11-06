package PracticeBinary;

import java.util.Arrays;
import java.util.Scanner;

public class FairCandySwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] arr1 = new int[m];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int i = 0; i < m; i++) arr1[i] = sc.nextInt();
        System.out.println(Arrays.toString(swap(arr, arr1)));
    }

    public static int[] swap(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sumA = 0, sumB = 0;
        for (int i : A) sumA += i;
        for (int i : B) sumB += i;
        int diff = (sumA - sumB) / 2;
        int[] ans = new int[2];
        for (int j : A) {

            int left = 0, right = B.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (B[mid] == j - diff) {
                    ans[0] = j;
                    ans[1] = B[mid];
                    return ans;
                } else if (B[mid] > j - diff) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return ans;
    }
}
