package slidingWindow;

import java.util.Scanner;

public class NumberOfSegments {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            countSegments(arr, k);
        }
    }

    private static void countSegments(long[] arr, long k) {

        int i = 0, j = 0;
        long sum = arr[0];
        boolean flag = false;

        while (i < arr.length && j < arr.length) {
            if (sum == k) {
                flag = true;
                break;
            }
            if (sum < k) {
                j++;
                if (j < arr.length)
                    sum += arr[j];
            } else {
                sum -= arr[i];
                i++;
            }
        }

       if(flag){
           System.out.println("Yes");
       }else {
           System.out.println("No");
       }
    }


}

