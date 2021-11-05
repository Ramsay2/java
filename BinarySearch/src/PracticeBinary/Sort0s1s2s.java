package PracticeBinary;

import java.util.Scanner;

public class Sort0s1s2s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sort(arr,n);
    }
    static void sort(int[] a, int n){
        int lo = 0;
        int hi = n - 1;
        int mid = 0, temp;
        while (mid <= hi) {
            switch (a[mid]) {
                case 0 -> {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                }
                case 1 -> mid++;
                case 2 -> {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                }
            }
        }
        for (int i = 0; i < n; i++){
            System.out.print(a[i]+ " ");
        }
    }
}
