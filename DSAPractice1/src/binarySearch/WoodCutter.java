package binarySearch;
import java.util.*;

public class WoodCutter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        long sum = 0, temp = 0;
        for (int i = n - 2; i >= 0; i--) {
            long preSum = arr[i + 1] - arr[i];
            sum += preSum + preSum * (n - 2 - i);

            if (sum > m) {

                temp = arr[i] + (sum - m) / (n - 2 - i + 1);
                break;

            } else if (sum == m){
                temp = arr[i];
                break;
            }
        }
        System.out.println(temp);
    }
}