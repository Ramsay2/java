import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(search(arr,0,n,m));

    }

    public static int search(int[] arr, int start, int end, int target) {
        Arrays.sort(arr);
        if(start > end) return -1;
        int mid = start + (start + end) / 2;
        if(arr[mid] == target) {
            return 1;
        }else  if(arr[mid] < target) {
            return search(arr, start + 1, end, target);
        }else{
            return search(arr, start , end - 1, target);
        }
    }
}
