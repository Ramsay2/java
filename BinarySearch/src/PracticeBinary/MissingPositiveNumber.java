package PracticeBinary;

import java.util.Scanner;

public class MissingPositiveNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println(findKthPositive(arr, m));
    }

    public static int findKthPositive(int[] arr, int k) {
        int n = 0, m = 0;
        for (int i = 0; i < arr[arr.length - 1]; i++) {
            if (arr[n] != i + 1) {
                //ans[m] = i;
                m++;
            }else {
                n++;
            }
            if (m == k) {
                return i + 1;
            }
        }

        return arr[arr.length - 1] + k - m;

    }
}
