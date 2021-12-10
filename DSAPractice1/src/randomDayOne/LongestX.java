package randomDayOne;

import java.util.Arrays;
import java.util.Scanner;

public class LongestX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findX(arr, n));
        }
    }

    static int findX(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                int start = 0;
                int end = n - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (arr[mid] < 0) {
                        start = mid + 1;
                    } else {
                        if (arr[mid] < -arr[i]) {
                            start = mid + 1;
                        } else if (arr[mid] > -arr[i]) {
                            end = mid - 1;
                        } else {
                           return -arr[i];
                        }
                    }

                }
            } else {
                break;
            }

        }
        return ans;
    }
}
