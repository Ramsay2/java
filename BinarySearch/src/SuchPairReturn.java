import java.util.Arrays;
import java.util.Scanner;

public class SuchPairReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
            System.out.println(findPair(arr, n, target));
        }
    }

    private static int findPair(int[] arr, int n, int target) {
        Arrays.sort(arr);

        int start = 0, end = n - 1;

        while (start < end) {
        if(arr[start] + arr[end] == target){
            return 1;
        }else if(arr[start] + arr[end] < target){
            start++;
        }else{
            end--;
        }

        }
        return -1;

    }
}
