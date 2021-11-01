package PracticeBinary;

import java.util.Scanner;

public class PeakINMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        PeakINMountain peakINMountain = new PeakINMountain();
        System.out.println(peakINMountain.peak(arr));
    }
    public int peak(int[] arr){
        int s = 0, l = arr.length - 1;
        while (s <= l){
            int mid = s + (l - s) / 2;
            if(arr[mid] > arr[mid + 1] &&arr[mid] > arr[mid - 1]) return mid;
            if(arr[mid] > arr[mid + 1]) l = mid;
            if(arr[mid] < arr[mid + 1]) s = mid;
        }
        return -1;
    }
}
