import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchLoop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();


        System.out.println(search(arr, 0, n -1 , m));

    }

    public static int search(int[] arr, int start, int end, int target) {
        Arrays.sort(arr);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return 1;

            if (arr[mid] < target)
                start = mid + 1;

            else
                end = mid - 1;
        }


        return -1;
    }
}
