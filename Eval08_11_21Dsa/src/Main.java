import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        search(arr, 0, n - 1, target);
    }

    private static void search(int[] arr, int start, int end, int target) {
        Arrays.sort(arr);

        if (start > end) {
            System.out.println(-1);
            return;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            System.out.println(1);
        }
        else if (arr[mid] < target) {
            search(arr, mid + 1, end, target);
        }
        else if (arr[mid] > target) {
            search(arr, start, mid - 1, target);
        }
    }
}
