import java.util.Arrays;
import java.util.Scanner;

public class SearchNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int m = sc.nextInt();
        while (m-- != 0) {
            int q = sc.nextInt();
            int target = sc.nextInt();
            findN(arr, 0, target, q);
        }
    }

    public static void findN(int[] array, int low, int k, int q) {
        boolean flag = false;
        Arrays.sort(array);
       int ans = 0;
        if (q == 0) {
            int mid;
            int high = array.length - 1;
            while (low <= high) {

                mid = low + (high - low) / 2;

                if (array[mid] == k) {
                    ans = mid;
                    high = mid - 1;
                    flag = true;
                } else if (array[mid] > k) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        if (q == 1) {
            int mid;
            int high = array.length - 1;

            while (low <= high) {
                mid = low + (high - low) / 2;

                if (array[mid] >=k) {
                    ans = mid;
                    high = mid - 1;
                    flag = true;

                } else {
                    low = mid + 1;
                }
            }
        }
        // System.out.println(array.length - ans + 1);
        if (flag) {
            if (q == 0) {
                System.out.println(array.length - ans );
            }
            if (q == 1) {
                System.out.println(array.length - ans -1);
            }

        } else {
            System.out.println(0);
        }

    }
}




