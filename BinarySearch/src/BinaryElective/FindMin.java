package BinaryElective;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
            minG(arr, n , d);
        }

    }

    private static void minG(long[] arr, long m, long d) {

        long start = 0;
        long end = 40;
        long ans = Integer.MAX_VALUE;
        System.out.println(ans);
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (isValid(arr, m, d, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        System.out.println(ans);


    }

    private static boolean isValid(long[] arr, long m, long d, long mid) {
        long days = 0;
        long k = 0, temp = 0;
        for (int i = 0; i < m; i++) {
            k += arr[i];
            if(k == mid){
                temp = mid;
                break;
            }else if(k > mid){
                temp = k - arr[i];
                break;
            }
        }
        k = 0;
        for(int i = 0; i < m;i++){
            k+= arr[i];
            if(k > temp){
                days++;
                i--;
                k = 0;
            }else if(k == temp){
                days++;
                k = 0;
            }
            if(days > d) return false;

        }

        return true;
    }
}
