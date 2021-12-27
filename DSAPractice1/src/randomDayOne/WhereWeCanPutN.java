package randomDayOne;

import java.util.Scanner;

public class WhereWeCanPutN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(findN(arr, n, m));
    }

    static int findN(int[] arr, int n, int m) {
        int ans = Integer.MIN_VALUE;
       // boolean flag = false;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == m) {
                ans = mid ;
                break;
            }
            if (arr[mid] < m) {
                start = mid + 1;
                ans = mid + 1 ;
            }
            if (arr[mid] > m) {
                end = mid - 1;
            }
        }


        return ans;
    }
}
