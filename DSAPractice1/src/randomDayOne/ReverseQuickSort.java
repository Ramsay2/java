package randomDayOne;

import java.util.Scanner;


public class ReverseQuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void reverseSort(int[] arr, int i, int j) {
        if (i < j) {
            int k = partition(arr, i, j);
            reverseSort(arr, i, k - 1);
            reverseSort(arr, k + 1, j);
        }
    }

    private static int partition(int[] arr, int i, int j) {

        int pivot = arr[j];
        int k = i;
        for (int m = i; m < j; m++) {
            if (arr[m] > pivot) {
                swap(arr, m, k);
                k++;
            }
        }
        swap(arr, j, k);
        return k;
    }

    private static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
