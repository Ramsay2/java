package randomDayOne;

import java.util.Scanner;

public class AbandonedCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(findTarget(arr, target));
        }
    }

    public static int findTarget(int[] arr, int target) {
        int result = Integer.MAX_VALUE, sum = 0;
        for (int i = 0, j = 0; i < arr.length; i++) {

            if (sum < target) {
                sum += arr[i];
            }
            if (sum > target) {
                sum = 0;
                i = j++;
            }
            if (sum == target) {
                result = Math.min(result, i - j + 1);
                sum = 0;
                i = j++;
            }
        }
        if (result == Integer.MAX_VALUE) {
            return -1;
        }
        return result;

    }
}
