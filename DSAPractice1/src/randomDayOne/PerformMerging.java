package randomDayOne;

import java.util.Scanner;

public class PerformMerging {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] brr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            brr[i] = sc.nextInt();
        }
        int[] ans = merge(arr, brr);
        for (int i : ans) {
            System.out.print(i +" ");
        }

    }

    static int[] merge(int[] arr, int[] brr) {
        int[] crr = new int[arr.length + brr.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                crr[k] = arr[i];
                i++;
            } else {
                crr[k] = brr[j];
                j++;
            }
            k++;
        }
        while (i < arr.length) {
            crr[k] = arr[i];
            i++;
            k++;
        }
        while (j < brr.length) {
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;
    }
}
