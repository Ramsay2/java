package sorting;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        quickSort(arr,0,n - 1);
        for (int i = 0; i < n;i++)
            System.out.print(arr[i] +" ");

    }

    public static void quickSort(int[] arr, int l, int h) {

        if (l < h) {
            int p = part(arr, l, h);
            quickSort(arr, p + 1, h);
            quickSort(arr, l, p - 1);
        }
    }

    public static int part(int[] arr, int l, int h) {
        int p = arr[l];
        int i = l, j = h;
        while (i < j) {
            while ( i <= h &&arr[i] <= p  ) i++;
            while (arr[j] > p) j--;
            if (i < j) swap(arr, i, j);
        }
        swap(arr, j, l);
        return j;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}